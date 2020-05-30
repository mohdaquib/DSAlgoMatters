package com.ds.algo.matters.array;

public class KadensAlgo {
    public static void main(String[] args){
        int[] input = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubarraySum(input, 8));
    }

    /** This method will find largest contiguous array of maximum sum **/
    private static int maxSubarraySum(int arr[], int n){
        int localMax = arr[0];
        int globalMax = arr[0];
        for(int i = 1; i < n; i++){
            localMax = Math.max(arr[i], arr[i] + localMax);
            globalMax = Math.max(globalMax, localMax);
        }

        return globalMax;
    }
}
