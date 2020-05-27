package com.ds.algo.matters.array;

import java.util.Arrays;

public class ZeroXORPairs {
    public static void main (String[] args) {
        int[] input = {1, 3, 2, 1, 4, 1, 1};
        System.out.println(countPairs(input, input.length));
    }

    /** This method will count pairs for XOR of zero **/
    private static int countPairs(int[] A, int N){
        int maximum = Arrays.stream(A).max().getAsInt();
        int[] frequency = new int[maximum + 1];

        for(int i = 0; i < N; i++){
            frequency[A[i]] += 1;
        }

        int answer = 0;
        for(int i = 0; i < (maximum) + 1; i++){
            answer = answer + frequency[i] * (frequency[i] - 1);
        }

        return answer / 2;
    }
}
