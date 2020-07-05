package com.ds.algo.matters.linkedlist;

public class RearrangeLinkedList {
    public static void main(String[] args){
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(4);
        root.next.next.next.next = new Node(5);
        root.next.next.next.next.next = new Node(6);
        root.next.next.next.next.next.next = new Node(7);
        LinkedListUtils.printList(rearrangeLinkedList(root));
    }

    /** This method will rearrange a given linked list (L0->l1....->Ln-1->Ln) in
     * this format (L0->Ln->L1->Ln-1->l2->Ln-2)
     */
    private static Node rearrangeLinkedList(Node head){
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node node1 = head;
        Node node2 = slow.next;
        slow.next = null;
        node2 = LinkedListUtils.reverseList(node2);

        head = new Node(0);
        Node curr = head;
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
