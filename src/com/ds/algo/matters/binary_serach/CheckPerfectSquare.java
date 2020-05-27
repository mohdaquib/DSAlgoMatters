package com.ds.algo.matters.binary_serach;

public class CheckPerfectSquare {
    public static void main(String[] args){
        System.out.println(isPerfectSquare(2520, 1, 2500));
    }

    /** This method will validate for perfect square **/
    private static boolean isPerfectSquare(int num, int start, int last){
        long mid = (start + last) / 2;
        if (start > last) return false;
        if (mid * mid == num){
            return true;
        }

        else if (mid*mid > num){
            return isPerfectSquare(num, start, (int) mid - 1);
        }

        else {
            return isPerfectSquare(num, (int) mid + 1, last);
        }
    }
}
