package com.ds.algo.matters.binary_serach;

public class TransitionPointInArray {
    public static void main(String[] args){
        int[] input = {0, 0, 0, 1};
        System.out.println(transitionPoint(input, input.length));
    }

    /** This method will find transition point where we get first occurrence of 1 in array **/
    private static int transitionPoint(int[] arr, int N) {
        if (arr[0] == 1) return 0;
        int low = 0, high = N - 1;
        while (low <= high){
            int mid = (low + high) / 2;

            if (arr[mid] == 0) low = mid + 1;

            else if(arr[mid] == 1) {
                if (arr[mid - 1] == 0) return mid;

                high = mid - 1;
            }
        }

        return -1;
    }
}
