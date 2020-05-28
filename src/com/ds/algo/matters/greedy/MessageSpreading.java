package com.ds.algo.matters.greedy;

import java.util.Scanner;

/** This is basic question of greedy tag
 * And question link is - https://practice.geeksforgeeks.org/problems/message-spreading/0
 */
public class MessageSpreading {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++){
            int n = s.nextInt();
            System.out.println(2*(n-1));
        }
    }
}
