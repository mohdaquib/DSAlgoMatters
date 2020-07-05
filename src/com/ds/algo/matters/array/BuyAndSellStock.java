package com.ds.algo.matters.array;

public class BuyAndSellStock {
    public static void main(String[] args){
        int[] input = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(input));
    }

    private static int maxProfit(int[] prices){
        int maxCur = 0, maxSoFar = 0;
        for (int i = 1; i < prices.length; i++){
            maxCur = Math.max(0, maxCur + (prices[i] - prices[i - 1]));
            maxSoFar = Math.max(maxCur, maxSoFar);
        }

        return maxSoFar;
    }
}
