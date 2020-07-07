package com.ds.algo.matters.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTreeInvert {
    public static void main(String[] args){
        TreeNode root = null;

        root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Binary Tree before traversal");
        preorder(root);
        invertTree(root);
        System.out.println();
        System.out.println("Binary tree after traversal");
        preorder(root);
    }

    private static void swap(TreeNode root){
        if (root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    private static void invertTree(TreeNode root){
        if (root == null){
            return;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode curr = queue.poll();
            swap(curr);

            if (curr.left != null){
                queue.add(curr.left);
            }

            if (curr.right != null){
                queue.add(curr.right);
            }
        }
    }

    private static void preorder(TreeNode root){
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
