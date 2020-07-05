package com.ds.algo.matters.array;

public class MaxSumWithoutAdjacent {
    public static void main(String[] args){
        int[] input = {4, 1, 1, 4, 2, 1};
        System.out.println(maxSumWithoutAdjacent(input));
    }

    /** This method will find maximum sum without adjacent **/
    private static int maxSumWithoutAdjacent(int[] A){
        int incl = A[0], excl = 0;
        for (int i = 1; i < A.length; i++){
            int temp = incl;
            incl = Math.max(incl, excl + A[i]);
            excl = temp;
        }

        return incl;
    }
}
