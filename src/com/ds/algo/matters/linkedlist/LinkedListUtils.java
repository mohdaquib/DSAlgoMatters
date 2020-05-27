package com.ds.algo.matters.linkedlist;

public class LinkedListUtils {

    /** This utility method will reverse linkedlist **/
    public static ListNode reverseList(ListNode head){
        ListNode curr = head, prev = null, next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    /** This utility method will print linked list **/
    public static void printList(ListNode head){
        ListNode temp = head;
        while (temp != null){
            if (temp.next == null){
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + "->");
            }
            temp = temp.next;
        }
    }
}
