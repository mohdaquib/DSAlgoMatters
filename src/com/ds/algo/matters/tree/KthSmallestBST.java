package com.ds.algo.matters.tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class KthSmallestBST {
    private static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.left.left.left = new TreeNode(1);

        System.out.println(kthSmallestIterative(root, 3));
    }

    /** This method will find kth smallest element in BST
     * Problem Link - https://leetcode.com/problems/kth-smallest-element-in-a-bst/
     **/
    private static int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return list.get(k - 1);
    }

    private static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }

    /** This method will find kth smallest element in BST using iterative method **/
    private static int kthSmallestIterative(TreeNode root, int k){
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (true){
            while (root != null){
                stack.add(root);
                root = root.left;
            }

            root = stack.removeLast();
            System.out.println(root.data);
            if (--k == 0) return root.data;
            root = root.right;
        }
    }
}
