package com.ds.algo.matters.matrix;

public class KthSmallestInSortedMatrix {
    public static void main(String[] args){
        int[] a1 = {1, 5, 9};
        int[] a2 = {10, 11, 13};
        int[] a3 = {12, 13, 15};
        int[][] matrix = {a1, a2, a3};
        System.out.println(kthSmallest(matrix, 5));
    }

    private static int kthSmallest(int[][] matrix, int k){
        int lo = matrix[0][0], hi = matrix[matrix.length - 1][matrix[0].length - 1] + 1;
        while (lo < hi){
            int mid = lo + (hi - lo)/2;
            int count = 0, j = matrix[0].length - 1;
            for (int i = 0; i < matrix.length; i++){
                while (j >= 0 && matrix[i][j] > mid) j--;
                count += (j + 1);
            }
            if (count < k) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
