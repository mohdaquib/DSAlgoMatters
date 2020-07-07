package com.ds.algo.matters.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTreeHeight {
    public static void main(String[] args){
        TreeNode root = null;

        root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);

        System.out.println(heightIterative(root));
    }

    private static int height(TreeNode root){
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private static int heightIterative(TreeNode root){
        if (root == null) return 0;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        TreeNode front = null;
        int height = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size-- > 0){
                front = queue.poll();

                if (front.left != null){
                    queue.add(front.left);
                }

                if (front.right != null){
                    queue.add(front.right);
                }
            }
            height++;
        }

        return height;
    }
}
