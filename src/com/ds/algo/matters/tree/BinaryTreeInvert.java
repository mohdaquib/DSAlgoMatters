package com.ds.algo.matters.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTreeInvert {
    public static void main(String[] args){
        BTNode root = null;

        root = new BTNode(1);

        root.left = new BTNode(2);
        root.right = new BTNode(3);

        root.left.left = new BTNode(4);
        root.left.right = new BTNode(5);
        root.right.left = new BTNode(6);
        root.right.right = new BTNode(7);

        System.out.println("Binary Tree before traversal");
        preorder(root);
        invertTree(root);
        System.out.println();
        System.out.println("Binary tree after traversal");
        preorder(root);
    }

    private static void swap(BTNode root){
        if (root == null) return;
        BTNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    private static void invertTree(BTNode root){
        if (root == null){
            return;
        }

        Queue<BTNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()){
            BTNode curr = queue.poll();
            swap(curr);

            if (curr.left != null){
                queue.add(curr.left);
            }

            if (curr.right != null){
                queue.add(curr.right);
            }
        }
    }

    private static void preorder(BTNode root){
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
