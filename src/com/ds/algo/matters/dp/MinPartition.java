package com.ds.algo.matters.dp;

import java.util.Arrays;

public class MinPartition {
    public static void main(String[] args){
        int[] S = {1, 2, 7};
        System.out.println(minPartition(S));
    }

    private static int minPartition(int[] S){
        int sum = Arrays.stream(S).sum();

        boolean[][] T = new boolean[S.length + 1][sum + 1];
        for (int i = 0; i <= S.length; i++){
            T[i][0] = true;
            for (int j = 1; i > 0 && j <= sum; j++){
                T[i][j] = T[i - 1][j];

                if (S[i - 1] <= j){
                    T[i][j] |= T[i - 1][j - S[i - 1]];
                }
            }
        }

        int j = sum/2;
        while (j >= 0 && !T[S.length][j]){
            j--;
        }
        return sum - 2*j;
    }
}
