package com.ds.algo.matters.dp;

public class SubsetSum {
    public static void main(String[] args){
        int[] A = {7, 3, 2, 5, 8};
        int sum = 18;

        System.out.println(subsetSum(A, sum));
    }

    private static boolean subsetSum(int[] A, int sum){
        int n = A.length;
        boolean[][] T = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++){
            T[i][0] = true;
        }

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= sum; j++){
                if (A[i - 1] > j){
                    T[i][j] = T[i - 1][j];
                } else {
                    T[i][j] = T[i - 1][j] || T[i - 1][j - A[i - 1]];
                }
            }
        }

        return T[n][sum];
    }
}
