package com.ds.algo.matters.binary_serach;

public class GetHighestNum {
    public static void main(String[] args){
        int[] input = {1, 2, 3, 4, 5};
        System.out.println(getHighestNum(input, 0, input.length - 1));
    }

    /** This method will find highest num in array of form a[1]<a[2]<a[3]<a[i]...>a[i+1]>a[n] **/
    private static int getHighestNum(int[] A, int low, int high){
        if (low == high){
            return A[low];
        }

        if ((high == low + 1) && A[low] >= A[high]){
            return A[low];
        }

        if ((high == low + 1) && A[low] < A[high]){
            return A[high];
        }

        int mid = (low + high) / 2;
        if (A[mid] > A[mid + 1] && A[mid] > A[mid - 1]){
            return A[mid];
        }

        if (A[mid] > A[mid + 1] && A[mid] < A[mid - 1]){
            return getHighestNum(A, low, mid - 1);
        } else {
            return getHighestNum(A, mid + 1, high);
        }
    }
}
