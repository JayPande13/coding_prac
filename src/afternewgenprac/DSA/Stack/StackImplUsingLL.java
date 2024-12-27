package afternewgenprac.DSA.Stack;

public class StackImplUsingLL {

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    static class stack{
        static Node head ;
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.val;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.val;
        }

    }



    public static void main(String[] args) {
        stack stackImplUsingLL = new stack();
        stackImplUsingLL.push(10);
        stackImplUsingLL.push(20);
        stackImplUsingLL.push(30);
        stackImplUsingLL.push(40);
        stackImplUsingLL.push(50);

        while(!stackImplUsingLL.isEmpty()){
            System.out.print(stackImplUsingLL.peek() + " ");
            stackImplUsingLL.pop();
        }
        System.out.println();


    }
}
