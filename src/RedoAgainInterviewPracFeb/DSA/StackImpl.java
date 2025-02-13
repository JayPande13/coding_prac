package RedoAgainInterviewPracFeb.DSA;

import java.util.ArrayList;
import java.util.LinkedList;

public class StackImpl {
    class usingArray{
        int top;
        int[] arr;
        int size;

        usingArray(int capacity){
            int[] arr = new int[capacity];
            top = -1;
            size = capacity;
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public boolean isFull(){
            return top == size;
        }

        public void push(int item){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[++top] =top;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int currentTop = arr[top];
            arr[top--] = 0;
            return currentTop;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }

    }
    class usingList{
        ArrayList<Integer> List = new ArrayList<>();
        int top;

        usingList(){
            int top =-1;
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public void push(int item){
            top++;
            List.add(item);
        }

        public int pop(){
            if(top == -1){
                System.out.println("Stack is empty");
                return -1;
            }
            return List.remove(top--);

        }

        public int peek(){
            if(top == -1){
                System.out.println("Stack is empty");
                return -1;
            }
            return List.get(top);
        }
    }
    class usingLinkedList{
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                next = null;
            }
        }
        Node head;
        public boolean isEmpty(){
            return head == null;
        }

        public void push(int item){
            Node newNode = new Node(item);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int item = head.data;
            head = head.next;
            return item;
        }

        public int peek(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

    }
}
