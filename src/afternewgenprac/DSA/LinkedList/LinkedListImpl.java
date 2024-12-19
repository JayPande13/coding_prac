package afternewgenprac.DSA.LinkedList;

import java.awt.*;

public class LinkedListImpl {
    Node head;
    int size;
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    LinkedListImpl(){
        this.size = 0;
    }


    public void addFirst(int input){
        Node firstNode = new Node(input);
        size++;
        if(head == null) {
            head = firstNode;
            return;
        }
        firstNode.next = head;
        head = firstNode;
    }

    public void addLast(int input){
        Node lastNode = new Node(input);
        size ++;
        //  Size cannot be place after this as after if statement you will miss the head==null case and pointer will return
        if(head == null) {
            head = lastNode;
            return;
        }
        Node pointer = head;
        while(pointer.next  != null){
            pointer = pointer.next;
        }
        pointer.next = lastNode;
    }

    public void removeFirst(){
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast(){
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        //  Size cannot be place after this as after if statement you will miss the head==null case and pointer will return
        if(head.next == null){
            head=null;
            return;
        }
        Node pointer = head;
        Node previousPointer =head;
        while(pointer.next  != null){
            previousPointer = pointer;
            pointer = pointer.next;
        }
        previousPointer.next = null;

    }

    public void printLinkedList(){
        Node pointer = head;
        if(head == null) {
            System.out.println("List Empty");
            return;
        };
        while(pointer  != null){
            System.out.print(pointer.data + " -> ");
            pointer = pointer.next;
        }
        System.out.println("NULL");
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LinkedListImpl LL = new LinkedListImpl();
        LL.addFirst(1);
        LL.addFirst(2);
        LL.addFirst(3);
        LL.printLinkedList();
        LL.addLast(5);
        LL.printLinkedList();
        LL.removeFirst();
        LL.printLinkedList();
        LL.removeLast();
        LL.printLinkedList();
        System.out.println(LL.getSize());
    }
}
