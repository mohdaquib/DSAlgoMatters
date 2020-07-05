package com.ds.algo.matters.array;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args){
        int[] input = {1, 2, 0, 0, 0, 3, 6};
        moveZeros(input);
        System.out.println(Arrays.toString(input));
    }

    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private static void moveZeros(int[] A){
        int start = 0;
        for (int i = 0; i < A.length; i++){
            if (A[i] != 0){
                swap(A, start, i);
                start++;
            }
        }

       /*int count = 0;
       for (int i = 0; i < A.length; i++){
           if (A[i] != 0){
               A[count++] = A[i];
           }
       }

       while (count < A.length){
           A[count++] = 0;
       }*/
    }
}
