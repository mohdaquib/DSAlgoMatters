package com.ds.algo.matters.greedy;

import java.util.Arrays;

public class SwapAndMaximize {
    public static void main(String[] args){
        int[] A = {4, 2, 1, 8};
        int n = A.length;
        int sum = 0;
        Arrays.sort(A);
        for (int i = 0; i < n/2; i++){
            sum -= (2*A[i]);
            sum += (2*A[n-i-1]);
        }
        System.out.println(sum);
    }
}
