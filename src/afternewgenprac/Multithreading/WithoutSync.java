package afternewgenprac.Multithreading;

import java.util.ArrayList;

public class WithoutSync {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i); // Not thread-safe
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

        System.out.println("Size of list: " + list.size()); // May not be 2000 due to race conditions
    }
}
