package com.ds.algo.matters.string;

public class SmallestString {
    public static void main(String[] args){
        String str1 = "abccba";
        System.out.println(findStr(str1));
    }

    private static String findStr(String s){
        StringBuilder sb =  new StringBuilder(s);
        int n = sb.length();
        for (int i = 0; i < n/2; i++){
            if (sb.charAt(i) != 'a'){
                sb.setCharAt(i, 'a');
                return sb.toString();
            }
        }

        sb.setCharAt(n - 1, 'b');
        return n < 2 ? "-1" : sb.toString();
    }
}
