package com.ds.algo.matters.tree;

import java.util.Stack;

public class PostOrderIterative {
    public static void main(String[] args){
        BTNode root = new BTNode(1);
        root.left = new BTNode(2);
        root.right = new BTNode(3);

        root.left.left = new BTNode(4);
        root.left.right = new BTNode(5);

        root.right.left = new BTNode(6);
        root.right.right = new BTNode(7);

        postOrderIterative(root);
    }

    private static void postOrderIterative(BTNode root){
        Stack<BTNode> stack = new Stack<>();
        stack.push(root);

        Stack<Integer> out = new Stack<>();
        while (!stack.isEmpty()){
            BTNode curr = stack.pop();
            out.push(curr.data);

            if (curr.left != null){
                stack.push(curr.left);
            }

            if (curr.right != null){
                stack.push(curr.right);
            }
        }

        while (!out.isEmpty()){
            System.out.println(out.pop() + " ");
        }
    }
}
