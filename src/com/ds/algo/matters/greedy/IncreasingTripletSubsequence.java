package com.ds.algo.matters.greedy;

import java.util.Stack;

public class IncreasingTripletSubsequence {
    public static void main(String[] args){
        int[] input = {1, 2, 3, 4, 5};
        System.out.println(increasingTriplet(input));
    }

    public static boolean increasingTriplet(int[] nums) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < nums.length; i++){
            if(s.isEmpty() || (s.peek() < nums[i])){
                s.push(nums[i]);
                if (s.size() == 3) break;
            }
        }
        return s.size() == 3;
    }
}
