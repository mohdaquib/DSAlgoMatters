package com.ds.algo.matters.linkedlist;

public class LinkedListUtils {

    /** This utility method will reverse linkedlist **/
    public static Node reverseList(Node head){
        Node curr = head, prev = null, next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    /** This utility method will print linked list **/
    public static void printList(Node head){
        Node temp = head;
        while (temp != null){
            if (temp.next == null){
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + "->");
            }
            temp = temp.next;
        }
    }

    /** This is utility method for getting middle node in a linked list **/
    public static Node getMiddle(Node head){
        if (head == null) return head;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
