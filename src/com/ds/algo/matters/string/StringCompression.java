package com.ds.algo.matters.string;

public class StringCompression {
    public static void main(String[] args){
        String input = "ABBBCCCCDD";
        System.out.println(encode(input));
    }

    private static String encode(String text){
        StringBuilder result = new StringBuilder();
        int count;
        for (int i = 0; i < text.length(); i++){
            count = 1;
            while (i + 1 < text.length() && text.charAt(i) == text.charAt(i+1)){
                count++;
                i++;
            }

            result.append(count).append(text.charAt(i));
        }

        return result.toString();
    }
}
