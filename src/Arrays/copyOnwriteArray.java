package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnwriteArray {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("Apple")) {
                list.add("Cherry"); // No ConcurrentModificationException here
            }
            System.out.println(item);
        }
    }
}


// Why you’re seeing “Apple” and “Banana” as output and not “Cherry”:
//
//	1.	When the iteration starts, the iterator holds a snapshot of the list at the time the iteration begins. In this case, the list has “Apple” and “Banana”.
//	2.	When you add “Cherry” inside the loop, the internal array of CopyOnWriteArrayList is updated, but the iterator is still working on the old snapshot (before the modification).
//	3.	Therefore, even though “Cherry” is added to the list, the iterator doesn’t know about it because it’s working on an old version of the list (the state when the iteration started).
