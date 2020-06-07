package com.ds.algo.matters.binary_serach;

public class FixedPoint {
    public static void main(String[] args){
        int[] A = {-10, -5, 3, 4, 7, 9};
        System.out.println(fixedPoint(A));
    }

    /** This method will find fixed point
     * A fixed is the one which having same number as index value
     * @param A
     * @return
     */
    private static int fixedPoint(int[] A){
        int l = 0, h = A.length - 1;
        while (l <= h){
            int mid = l + (h - l)/2;
            if (A[mid] == mid){
                return mid;
            } else if (A[mid] < mid){
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return -1;
    }
}
