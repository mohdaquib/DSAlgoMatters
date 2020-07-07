package com.ds.algo.matters.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(3);

        root.right.right = new TreeNode(6);

        root.left.left.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        root.right.right.right.right = new TreeNode(9);

        System.out.println(deepestLeavesSum(root));
    }

    /** This method will evaluate sum of deepest leaves of a binary tree **/
    private static int deepestLeavesSum(TreeNode root){
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sum = 0;
        while (!q.isEmpty()){
            int size = q.size();
            sum = 0;
            for (int i = size; i > 0; i--){
                TreeNode top = q.poll();
                sum += top.data;
                if (top.left != null) q.offer(top.left);
                if (top.right != null) q.offer(top.right);
            }
        }

        return sum;
    }
}
