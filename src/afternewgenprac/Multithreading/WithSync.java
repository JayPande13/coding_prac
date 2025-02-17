package afternewgenprac.Multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WithSync {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i); // Thread-safe
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of list: " + list.size()); // Will be 2000
    }
}

