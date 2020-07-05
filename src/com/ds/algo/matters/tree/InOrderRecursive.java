package com.ds.algo.matters.tree;

public class InOrderRecursive {
    public static void main(String[] args){
        BTNode root = new BTNode(1);
        root.left = new BTNode(2);
        root.right = new BTNode(3);

        root.left.left = new BTNode(4);
        root.left.right = new BTNode(5);

        root.right.left = new BTNode(6);
        root.right.right = new BTNode(7);

        inorder(root);
    }

    private static void inorder(BTNode node){
        if (node == null) return;

        if (node.left != null)
            inorder(node.left);

        System.out.println(node.data);

        if (node.right != null)
            inorder(node.right);
    }
}
