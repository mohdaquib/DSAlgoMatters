package com.ds.algo.matters.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeProductSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int[] a1 = new int[n];
            int[] a2 = new int[n];
            for (int j = 0; j < n; j++) {
                a1[j] = s.nextInt();
            }

            for (int k = 0; k < n; k++) {
                a2[k] = s.nextInt();
            }

            Arrays.sort(a1);
            Arrays.sort(a2);
            long result = 0;
            for (int x = 0, y = n - 1; x < n && y >= 0; x++, y--) {
                result += a1[x] * a2[y];
            }
            System.out.println(result);
        }
    }
}
