package com.ds.algo.matters.tree;

import java.util.Stack;

public class PostOrderIterative {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        postOrderIterative(root);
    }

    private static void postOrderIterative(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        Stack<Integer> out = new Stack<>();
        while (!stack.isEmpty()){
            TreeNode curr = stack.pop();
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
