package com.ds.algo.matters.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HuffmanCoding {
    /** This method will print code from min heap **/
    private static void printCode(HuffmanNode root, String s){
        if (root.left == null && root.right == null && Character.isLetter(root.c)){
            System.out.println(root.c + ":" + s);
            return;
        }

        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void main(String[] args){
        int n = 6;
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] frequency = {5, 9, 12, 13, 16, 45};
        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(n, new MyComparator());
        for (int i = 0; i < n; i++){
            HuffmanNode huffmanNode = new HuffmanNode();
            huffmanNode.c = charArray[i];
            huffmanNode.data = frequency[i];
            huffmanNode.left = null;
            huffmanNode.right = null;
            q.add(huffmanNode);
        }

        HuffmanNode root = null;
        while (q.size() > 1){
            HuffmanNode x = q.peek();
            q.poll();

            HuffmanNode y = q.peek();
            q.poll();

            HuffmanNode f = new HuffmanNode();
            f.data = x.data + y.data;
            f.c = '-';

            f.left = x;
            f.right = y;

            root = f;
            q.add(f);
        }

        printCode(root, "");
    }
}

/** Huffman Node class **/
class HuffmanNode {
    int data;
    char c;
    HuffmanNode left;
    HuffmanNode right;
}

/** Custom comparator for comparing two huffman objects during adding in priority queue **/
class MyComparator implements Comparator<HuffmanNode>{
    @Override
    public int compare(HuffmanNode o1, HuffmanNode o2) {
        return o1.data - o2.data;
    }
}
