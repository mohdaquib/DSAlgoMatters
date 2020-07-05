package com.ds.algo.matters.string;

import java.util.Arrays;

public class EncodedString {
    public static void main(String[] args){
        String s = "1226#24#";
        System.out.println(Arrays.toString(frequency(s)));
    }

    private static int[] frequency(String s){
        int[] res = new int[26];
        int len = s.length();
        int i = 0;
        while (i < len){
            int val = 0;
            if (i + 2 >= len || s.charAt(i + 2) != '#'){
                val = s.charAt(i) - '0';
                res[val - 1]++;
                i++;
            } else if (s.charAt(i + 2) == '#'){
                val = (s.charAt(i) - '0')*10 + (s.charAt(i + 1) - '0');
                res[val - 1]++;
                i = i + 3;
            }

            if (i < len){
                if (s.charAt(i) == '('){
                    int freq = s.charAt(i + 1) - '0';
                    res[val - 1] += freq - 1;
                    i = i + 3;
                }
            }
        }

        return res;
    }
}
