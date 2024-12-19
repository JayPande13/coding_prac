package afternewgenprac.DSA.LinkedList;

import CodingSecondTimeForPRac.HashMap;

public class RemoveNthNodeFromBack {

     // Definition for singly-linked list.
     public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

        public static ListNode removeNthFromEnd(ListNode head, int n) {

            if (head.next == null) {
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;
            int size = 0;

            while (fast.next != null) {
                size++;
                if (n > 0) {
                    fast = fast.next;
                    n--;
                } else {
                    slow = slow.next;
                    fast = fast.next;
                }
            }
            size +=1;
            System.out.println("ouside " + size);
            if (size == n) {
                System.out.println("Inside " +size);
                head = head.next;
                return head;
            }

            ListNode temp = slow.next;
            slow.next = slow.next.next;
            temp = null;
            return head;

        }

    public static ListNode reverseList(ListNode head) {
        ListNode newHead = null; // Head of the new reversed linked list
        while (head != null) {
            // Create a new node with the same data
            ListNode node = new ListNode(head.val);
            // Insert the new node at the head of the new list
            node.next = newHead;
            newHead = node;

            // Move to the next node in the original list
            head = head.next;
        }

        return newHead;
    }

    public static void main(String[] args) {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
//        ListNode ln3 = new ListNode(3);
//        ListNode ln4 = new ListNode(4);
        ln1.next = ln2;
        ln2.next = null;
//        ln3.next = ln4;
//        ln4.next = null;
        reverseList(ln1);
//        removeNthFromEnd(ln1,2);
    }
}
