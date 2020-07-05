package com.ds.algo.matters.array;

import java.util.Arrays;

public class RearrangePosNeg {
    public static void main(String[] args){
        int[] input = {4, -3, -7, -1, 5, 6, 2, 8, 9};
        rearrangeArrayOfPosNeg(input);
        System.out.println(Arrays.toString(input));
    }

    private static void rearrangeArrayOfPosNeg(int[] A){
        int i = -1, temp = 0, N = A.length;
        for (int j = 0; j < N; j++){
            if (A[j] < 0){
                i++;
                temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }

        int pos = i + 1, neg = 0;
        while (pos < N && neg < pos && A[neg] < 0){
            temp = A[neg];
            A[neg] = A[pos];
            A[pos] = temp;
            pos++;
            neg += 2;
        }
    }
}
