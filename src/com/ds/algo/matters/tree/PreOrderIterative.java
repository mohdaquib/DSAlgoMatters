package com.ds.algo.matters.tree;

import java.util.Stack;

public class PreOrderIterative {

    public static void main(String[] args){
        BTNode root = new BTNode(1);
        root.left = new BTNode(2);
        root.right = new BTNode(3);

        root.left.left = new BTNode(4);
        root.left.right = new BTNode(5);

        root.right.left = new BTNode(6);
        root.right.right = new BTNode(7);

        preOrderTraversal(root);
    }

    public static void preOrderTraversal(BTNode root){
        if (root == null) return;
        Stack<BTNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()){
            BTNode curr = stack.pop();
            System.out.println(curr.data);

            if (curr.right != null){
                stack.push(curr.right);
            }

            if (curr.left != null){
                stack.push(curr.left);
            }
        }
    }
}
