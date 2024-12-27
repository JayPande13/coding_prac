package afternewgenprac.DSA.LinkedList;

import CodingSecondTimeForPRac.HashMap;

public class RemoveNthNodeFromBack {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
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
        size += 1;
        System.out.println("ouside " + size);
        if (size == n) {
            System.out.println("Inside " + size);
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

    static ListNode l3 = null;
    static ListNode tail = null;

    public static void createNewLL(int data) {
        if (l3 == null) {
            l3 = new ListNode(data);
            tail = l3;
        } else {
            ListNode temp = new ListNode(data);
            tail.next = temp;
            tail = temp;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode firstListPointer = list1;
        ListNode secondListPointer = list2;

        while (firstListPointer != null && secondListPointer != null) {
            if (firstListPointer.val > secondListPointer.val) {
                createNewLL(secondListPointer.val);
                secondListPointer = secondListPointer.next;
            } else if (firstListPointer.val < secondListPointer.val) {
                createNewLL(firstListPointer.val);
                firstListPointer = firstListPointer.next;
            } else if (firstListPointer.val == secondListPointer.val) {
                createNewLL(firstListPointer.val);
                createNewLL(secondListPointer.val);
                firstListPointer = firstListPointer.next;
                secondListPointer = secondListPointer.next;
            }
        }
        while (firstListPointer != null) {
            createNewLL(firstListPointer.val);
            firstListPointer = firstListPointer.next;
        }
        while (secondListPointer != null) {
            createNewLL(secondListPointer.val);
            secondListPointer = secondListPointer.next;
        }
        printLinkedList(l3);
        return l3;
    }


    public static ListNode reversing(ListNode prev, ListNode curr) {
        if (curr == null) {
            return prev;
        }
        reversing(prev, curr.next);
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;

        return prev;
    }

    public static ListNode reverseLLList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode curr = head.next;

        ListNode newHead = reversing(prev, curr);
        head = newHead;
        printLinkedList(head);
        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode pointer = head;
        if (head == null) {
            System.out.println("List Empty");
            return;
        }
        ;
        while (pointer != null) {
            System.out.print(pointer.val + " -> ");
            pointer = pointer.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        ListNode ln1 = new ListNode(4);
        ListNode ln2 = new ListNode(3);
        ListNode ln3 = new ListNode(2);
        ListNode ln4 = new ListNode(1);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = null;
        ListNode ls1 = new ListNode(0);
        ListNode ls2 = new ListNode(2);
        ListNode ls3 = new ListNode(4);
        ls1.next = null;
        ls2.next = ls3;
        ls3.next = null;
//        ls4.next = null;
//        reverseList(ln1);
//        removeNthFromEnd(ln1,2);
//        mergeTwoLists(null,ls1);
        reverseLLList(ln1);

    }
}
