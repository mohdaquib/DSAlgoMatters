package com.ds.algo.matters.array;

import java.util.Arrays;

public class Sort012Array {
    public static void main(String[] args){
        int[] input = {0, 1, 2, 1, 0, 2, 1, 2};
        sort012(input, input.length);
        System.out.println(Arrays.toString(input));
    }

    /** This method will sort an array of 0, 1 and 2 **/
    private static void sort012(int[] A, int n){
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high){
            int num = A[mid];
            if (num == 0){
                swap(A, low, mid);
                low++;
                mid++;
            } else if (num == 2){
                swap(A, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    private static void swap(int[] A, int x, int y){
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
}
