package com.ds.algo.matters.array;

import java.util.Arrays;

public class ZigZagArray {
    public static void main(String[] args){
        int[] input = {1, 4, 3, 2};
        zigzagArray(input);
        System.out.println(Arrays.toString(input));
    }

    private static void zigzagArray(int[] A){
        for (int i = 1; i < A.length; i = i + 2){
            if (A[i] < A[i - 1]){
                swap(A, i, i - 1);
            }

            if(i < A.length - 1 && A[i] < A[i + 1]){
                swap(A, i, i + 1);
            }
        }
    }

    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
