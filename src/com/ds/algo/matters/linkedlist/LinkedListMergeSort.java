package com.ds.algo.matters.linkedlist;

public class LinkedListMergeSort {
    private static Node head = null;
    public static void main(String[] args){
        Node head = new Node(15);
        head.next = new Node(10);
        head.next.next = new Node(5);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(2);
        Node result = mergeSort(head);
        LinkedListUtils.printList(result);
    }

    private static Node sortedMerge(Node a, Node b){
        Node result = null;
        if (a == null) return b;
        if (b == null) return a;

        if (a.data < b.data){
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }

        return result;
    }

    private static Node mergeSort(Node h){
        if (h == null || h.next == null) return h;
        Node middle = LinkedListUtils.getMiddle(h);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(h);
        Node right = mergeSort(nextOfMiddle);

        Node sortedList = sortedMerge(left, right);
        return sortedList;
    }
}
