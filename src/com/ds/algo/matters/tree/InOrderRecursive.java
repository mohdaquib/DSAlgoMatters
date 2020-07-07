package com.ds.algo.matters.tree;

public class InOrderRecursive {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        inorder(root);
    }

    private static void inorder(TreeNode node){
        if (node == null) return;

        if (node.left != null)
            inorder(node.left);

        System.out.println(node.data);

        if (node.right != null)
            inorder(node.right);
    }
}
