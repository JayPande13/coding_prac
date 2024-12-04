package practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class reverseLL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);

        System.out.println(ll);

        LinkedList reverseList = new LinkedList();

        ListIterator litr = ll.listIterator(ll.size());

        while(litr.hasPrevious()){
            reverseList.add(litr.previous());
        }

        System.out.println(reverseList);
    }
}
