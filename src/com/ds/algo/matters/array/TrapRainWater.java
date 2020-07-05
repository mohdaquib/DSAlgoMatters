package com.ds.algo.matters.array;

public class TrapRainWater {
    public static void main(String[] args){
        int[] height = {2, 0, 2};
        System.out.println(trapUsingTwoPointers(height));
    }

    private static int trapUsingTwoPointers(int[] height){
        int N = height.length;
        if (N < 3) return 0;
        int totalWater = 0;
        int i = 1, j = N - 2;
        int lMax = height[0], rMax = height[N-1];
        while (i <= j){
            lMax = Math.max(lMax, height[i]);
            rMax = Math.max(rMax, height[j]);
            if (lMax <= rMax){
                totalWater += (lMax - height[i]);
                i++;
            } else {
                totalWater += (rMax - height[j]);
                j--;
            }
        }

        return totalWater;
    }


    /** This method will find total unit of water in an array of heights **/
    private static int trap(int[] height){
        int N = height.length;
        int[] leftMax = new int[N];
        int[] rightMax = new int[N];
        leftMax[0] = height[0];
        rightMax[N-1] = height[N-1];
        for(int i = 1; i < N; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        for(int i = N - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int totalWater = 0;
        for(int i = 0; i < N; i++){
            totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return totalWater;
    }
}
