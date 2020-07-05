package com.ds.algo.matters.tree;

import java.util.Stack;

public class InOrderIterative {
    public static void main(String[] args){
        BTNode root = new BTNode(1);
        root.left = new BTNode(2);
        root.right = new BTNode(3);

        root.left.left = new BTNode(4);
        root.left.right = new BTNode(5);

        root.right.left = new BTNode(6);
        root.right.right = new BTNode(7);

        inorderIterative(root);
    }

    private static void inorderIterative(BTNode root){
        Stack<BTNode> stack = new Stack<>();
        BTNode curr = root;

        while (!stack.isEmpty() || curr != null){
            if (curr != null){
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop();
                System.out.println(curr.data + " ");
                curr = curr.right;
            }
        }
    }
}
