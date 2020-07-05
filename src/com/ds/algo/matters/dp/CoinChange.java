package com.ds.algo.matters.dp;

public class CoinChange {
    public static void main(String[] args){
        int[] coins = {10, 6, 1};
        System.out.println(makeChange(12, coins));
    }

    private static int makeChange(int c, int[] coins){
        int[] cache = new int[c + 1];
        for (int i = 1; i <= c; i++){
            int minCoins = Integer.MAX_VALUE;

            for (int coin : coins){
                if (i - coin >= 0){
                    int currCoins = cache[i-coin] + 1;
                    if (currCoins < minCoins){
                        minCoins = currCoins;
                    }
                }
            }

            cache[i] = minCoins;
        }

        return cache[c];
    }
}
