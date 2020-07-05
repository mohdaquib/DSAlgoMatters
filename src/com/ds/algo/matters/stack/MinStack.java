package com.ds.algo.matters.stack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> aux;

    public MinStack() {
        s = new Stack<>();
        aux = new Stack<>();
    }

    public void push(int x){
        s.push(x);

        if (aux.isEmpty()){
            aux.push(x);
        } else {
            if (aux.peek() >= x){
                aux.push(x);
            }
        }
    }

    public int pop(){
        if (s.isEmpty()){
            System.out.println("Stack underflow!");
            return -1;
        }

        int top = s.pop();
        if (top == aux.peek()){
            aux.pop();
        }

        return top;
    }

    public int min(){
        if (aux.isEmpty()){
            System.out.print("Stack underflow!");
            return -1;
        }
        return aux.peek();
    }


    public static void main(String[] args){
        MinStack s = new MinStack();

        s.push(6);
        System.out.println(s.min());

        s.push(7);
        System.out.println(s.min());

        s.push(8);
        System.out.println(s.min());

        s.push(5);
        System.out.println(s.min());

        s.push(3);
        System.out.println(s.min());

        s.pop();
        System.out.println(s.min());

        s.push(10);
        System.out.println(s.min());

        s.pop();
        System.out.println(s.min());

        s.pop();
        System.out.println(s.min());
    }
}

