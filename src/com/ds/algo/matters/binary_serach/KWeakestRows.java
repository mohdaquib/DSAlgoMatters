package com.ds.algo.matters.binary_serach;

import java.util.Arrays;
import java.util.Comparator;

public class KWeakestRows {
    public static void main(String[] args){

    }

    /** This method will find k weakest rows and a weakest row will the one
     * which having lowest number of one'1
     * For reference please check - https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
     * @param mat
     * @param k
     * @return
     */
    public static int[] kWeakestRows(int[][] mat, int k) {
        CountOne[] countOnes = new CountOne[mat.length];
        int i = 0, m = mat.length, x = 0;
        while(i <= m - 1){
            int l = 0, h = mat[i].length - 1;
            CountOne c;
            if(x <= m - 1 && mat[i][l] == 0){
                c = new CountOne();
                c.ones = 0;
                c.index = i;
                countOnes[x++] = c;
                i++;
                continue;
            } else if(x <= m - 1 && mat[i][h] == 1){
                c = new CountOne();
                c.ones = h + 1; c.index = i;
                countOnes[x++] = c;
                i++;
                continue;
            }
            while(l <= h){
                int mid = l + (h - l)/2;
                if(x <= m - 1 && mat[i][mid] == 0 && mat[i][mid-1] == 1){
                    c = new CountOne();
                    c.ones = mid; c.index = i;
                    countOnes[x++] = c;
                    break;
                } else if(mat[i][mid] == 1){
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
            i++;
        }

        Arrays.sort(countOnes, Comparator.comparingInt(o -> o.ones));
        int[] output = new int[k];
        for(int y = 0; y < k; y++){
            CountOne c = countOnes[y];
            output[y] = c.index;
        }

        return output;
    }

    static class CountOne {
        public int ones;
        public int index;
    }
}
