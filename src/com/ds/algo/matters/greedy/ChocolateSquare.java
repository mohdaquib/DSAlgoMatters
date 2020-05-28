package com.ds.algo.matters.greedy;

import java.util.Arrays;
import java.util.Scanner;

/** This is easy greedy problem and
 * problem link is https://practice.geeksforgeeks.org/problems/ishaan-loves-chocolates/0
 */
public class ChocolateSquare {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++){
            int N = s.nextInt();
            int[] tastiness = new int[N];
            for(int j = 0; j < N; j++){
                tastiness[j] = s.nextInt();
            }
            Arrays.sort(tastiness);
            System.out.println(tastiness[0]);
        }
    }
}
