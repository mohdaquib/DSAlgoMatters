package com.ds.algo.matters.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {
    public static void main(String[] args){
        BTNode root = new BTNode(1);
        root.left = new BTNode(2);
        root.right = new BTNode(3);

        root.left.left = new BTNode(4);
        root.left.right = new BTNode(3);

        root.right.right = new BTNode(6);

        root.left.left.left = new BTNode(7);
        root.right.right.right = new BTNode(8);

        System.out.println(deepestLeavesSum(root));
    }

    /** This method will evaluate sum of deepest leaves of a binary tree **/
    private static int deepestLeavesSum(BTNode root){
        if (root == null) return 0;
        Queue<BTNode> q = new LinkedList<>();
        q.offer(root);
        int sum = 0;
        while (!q.isEmpty()){
            int size = q.size();
            sum = 0;
            for (int i = size; i > 0; i--){
                BTNode top = q.poll();
                sum += top.data;
                if (top.left != null) q.offer(top.left);
                if (top.right != null) q.offer(top.right);
            }
        }

        return sum;
    }
}
