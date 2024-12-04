package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
//        int i = 0;
//        while( i<10){
//            System.out.println("First " + i++); // Print First 0 -> Then Update to 1
//            System.out.println("First " + ++i); // Update to 1 -> Then Print 1
//            System.out.println("Second " + i); // Condition 1 : i-> 1 ; Condition 2: i -> 1
//        }


        List list =  new ArrayList();
        list.add(100);
        list.add('a');
        list.add("Testrepo");

        ListIterator listI = list.listIterator(list.size());

        while(listI.hasPrevious()){
//            System.out.println(listI.previous());
        }
//        System.out.println("-------------------------------------");

        while(listI.hasNext()){
//            System.out.println(listI.next());
        }


    }
}
