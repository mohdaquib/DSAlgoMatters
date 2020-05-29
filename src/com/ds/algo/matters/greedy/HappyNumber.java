package com.ds.algo.matters.greedy;

public class HappyNumber {
    public static void main(String[] args){
        System.out.println(isHappyNumber(15));

    }

    /** This method will validate number for happy number **/
    private static boolean isHappyNumber(int n){
        int slow, fast;
        slow = fast = n;

        do {
            slow = numSquareSum(slow);
            fast = numSquareSum(numSquareSum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    /** This method will give sum of squares of digits of number **/
    private static int numSquareSum(int num){
        int squareSum = 0;
        while (num != 0){
            squareSum += (num%10) * (num%10);
            num /= 10;
        }

        return squareSum;
    }
}
