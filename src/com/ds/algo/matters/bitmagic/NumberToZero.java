package com.ds.algo.matters.bitmagic;

public class NumberToZero {
    public static void main(String[] args){
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        shuffle(nums, n);
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int l = nums.length;
        int j = 0;
        for(int i = 0; i < n; i++){
            result[j++] = nums[i];
            result[j++] = nums[n + i];
        }

        return result;
    }
}
