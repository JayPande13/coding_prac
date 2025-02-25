package afternewgenprac.DSA.Queue;

public class QueueImpl {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class queue{
        static Node head;
        static Node tail;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(head== null ){
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = tail.next;
        }

        public static Integer remove(){
            if(head == null){
                System.out.println("Queue is Empty");
                return -1;
            }
            Node returnNode = head;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return returnNode.data;
        }

        public static Integer peek(){
            if(head == null){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        queue q = new QueueImpl.queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
