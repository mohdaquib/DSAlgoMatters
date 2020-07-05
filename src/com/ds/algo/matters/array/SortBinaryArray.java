package com.ds.algo.matters.array;

import java.util.Arrays;

public class SortBinaryArray {
    public static void main(String[] args){
        int[] input = {1, 0, 1, 0, 1, 0, 1, 0, 1, 1};
        sortBinaryArray(input);
        System.out.println(Arrays.toString(input));
    }

    /** This method will sort Binary array of 0's and 1's **/
    private static void sortBinaryArray(int[] A){
        int j = -1;
        for (int i = 0; i < A.length; i++){
            if (A[i] < 1){
                j++;
                swap(A, i, j);
            }
        }
    }

    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
