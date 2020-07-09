package com.ds.algo.matters.heap;

import java.util.*;

public class FindKthSmallest {
    public static void main(String[] args){
        Integer[] input = {7, 9, 6, 3, 4, 1};
        List<Integer> list = new ArrayList<>(Arrays.asList(input));
        System.out.println(kthSmallestElement(list, 3));
    }

    /** This method will find kth smallest element in array **/
    private static int kthSmallestElement(List<Integer> A, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(A);
        while (--k > 0){
            pq.poll();
        }

        return pq.isEmpty() ? -1 : pq.peek();
    }
}
