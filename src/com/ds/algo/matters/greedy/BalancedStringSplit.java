package com.ds.algo.matters.greedy;

public class BalancedStringSplit {
    public static void main(String[] args){
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }

    /** This method will find minimum number of balanced strings of equal number
     * R and L
     * Question Link - https://leetcode.com/problems/split-a-string-in-balanced-strings/
     */
    public static int balancedStringSplit(String s) {
        int res = 0, cnt = 0;
        for (int i = 0; i < s.length(); ++i) {
            cnt += s.charAt(i) == 'L' ? 1 : -1;
            if (cnt == 0) ++res;
        }
        return res;
    }
}
