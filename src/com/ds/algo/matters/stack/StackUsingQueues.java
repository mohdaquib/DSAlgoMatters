package com.ds.algo.matters.stack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueues {
    static Queue<Integer> q1 = new ArrayDeque<>();
    static Queue<Integer> q2 = new ArrayDeque<>();

    public static void main(String[] args){
        int[] keys = {1, 2, 3, 4, 5};
        for (int key : keys){
            add(key);
        }

        for (int i = 0; i <= keys.length; i++){
            System.out.println(poll());
        }
    }

    private static void add(int data){
        while (!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }

        q1.add(data);

        while (!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    private static int poll(){
        if (q1.isEmpty()){
            System.out.println("Underflow!!");
            System.exit(0);
        }

        int front = q1.peek();
        q1.poll();

        return front;
    }
}
