package LinkedList;

public class LinkedListCaller {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();

        ls = ls.add(ls,1);
        ls = ls.add(ls,2);
        ls = ls.add(ls,3);
        ls = ls.add(ls,4);
        ls = ls.add(ls,5);

        ls = ls.delete(ls,4);
//        ls= ls.editVariable(ls,4,6);

        ls.print(ls);
    }
}
