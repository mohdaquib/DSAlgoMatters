package com.ds.algo.matters.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTreeHeight {
    public static void main(String[] args){
        BTNode root = null;

        root = new BTNode(15);
        root.left = new BTNode(10);
        root.right = new BTNode(20);
        root.left.left = new BTNode(8);
        root.left.right = new BTNode(12);
        root.right.left = new BTNode(16);
        root.right.right = new BTNode(25);

        System.out.println(heightIterative(root));
    }

    private static int height(BTNode root){
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private static int heightIterative(BTNode root){
        if (root == null) return 0;

        Queue<BTNode> queue = new ArrayDeque<>();
        queue.add(root);

        BTNode front = null;
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
