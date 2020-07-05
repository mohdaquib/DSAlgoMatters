package com.ds.algo.matters.stack;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args){
        Stack<Integer> input = new Stack<>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        Stack<Integer> result = sortStack(input);
        while (!result.isEmpty()){
            System.out.print(result.pop() + " ");
        }
    }

    private static Stack<Integer> sortStack(Stack<Integer> input){
        Stack<Integer> tmpStack = new Stack<>();
        while (!input.isEmpty()){
            int tmp = input.pop();
            while (!tmpStack.isEmpty() && tmpStack.peek() > tmp){
                input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }

        return tmpStack;
    }
}
