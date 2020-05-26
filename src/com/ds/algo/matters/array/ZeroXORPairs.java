package com.ds.algo.matters.array;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroXORPairs {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++){
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for(int j = 0; j < N; j++){
                arr[j] = scanner.nextInt();
            }
            System.out.println(countPairs(arr, N));
        }
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
