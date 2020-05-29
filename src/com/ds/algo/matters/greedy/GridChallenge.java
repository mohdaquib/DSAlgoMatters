package com.ds.algo.matters.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    public static void main(String[] args){
        String s1 = "ppp", s2 = "ypp", s3 = "wyw";
        String[] arr = {s1, s2, s3};
        System.out.println(gridChallenge(arr));
    }
    static String gridChallenge(String[] grid) {
        List<String> sorted = new ArrayList<>();
        for(String s : grid){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            sorted.add(new String(arr));
        }

        for(int i = 0; i < sorted.size() - 1; i++){
            char[] s1 = sorted.get(i).toCharArray();
            char[] s2 = sorted.get(i+1).toCharArray();
            int j = 0;
            while(j != s1.length){
                if((int) s1[j] > (int) s2[j]){
                    return "NO";
                }
                j++;
            }
        }

        return "YES";
    }
}
