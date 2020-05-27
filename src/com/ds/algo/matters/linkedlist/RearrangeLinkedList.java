package com.ds.algo.matters.linkedlist;

public class RearrangeLinkedList {
    public static void main(String[] args){
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        root.next.next.next.next.next = new ListNode(6);
        root.next.next.next.next.next.next = new ListNode(7);
        LinkedListUtils.printList(rearrangeLinkedList(root));
    }

    /** This method will rearrange a given linked list (L0->l1....->Ln-1->Ln) in
     * this format (L0->Ln->L1->Ln-1->l2->Ln-2)
     */
    private static ListNode rearrangeLinkedList(ListNode head){
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode node1 = head;
        ListNode node2 = slow.next;
        slow.next = null;
        node2 = LinkedListUtils.reverseList(node2);

        head = new ListNode(0);
        ListNode curr = head;
        while (node1 != null || node2 != null){
            if (node1 != null){
                curr.next = node1;
                curr = curr.next;
                node1 = node1.next;
            }

            if (node2 != null){
                curr.next = node2;
                curr = curr.next;
                node2 = node2.next;
            }
        }

        return head.next;
    }
}
