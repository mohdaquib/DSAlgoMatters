package com.ds.algo.matters.binary_serach;

public class ShipWithinDays {
    public static void main(String[] args){
        int[] input = {1, 2, 3, 4, 5};
        System.out.println(shipWithinDays(input, 3));
    }

    /** This method is the solution of this problem
     * Link - https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
     * @param weights
     * @param D
     * @return
     */
    public static int shipWithinDays(int[] weights, int D) {
        int left = 0, right = 0;
        for (int w: weights) {
            left = Math.max(left, w);
            right += w;
        }

        while (left < right) {
            int mid = (left + right) / 2, need = 1, cur = 0;
            for (int w: weights) {
                if (cur + w > mid) {
                    need += 1;
                    cur = 0;
                }
                cur += w;
            }
            if (need > D) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
