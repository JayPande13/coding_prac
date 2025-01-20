package afternewgenprac.Multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PracProdConsBlockingQueue {
    private final Object lock = new Object();
    int maxRange = 5;
    private final BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(maxRange);

    public void producer() throws InterruptedException {
        for(int i = 0; i < 20; i++) {
            blockingQueue.put(i);
            System.out.println("Added in the Queue" + i);
            Thread.sleep(2000);
        }

    }

    public void consumer() throws InterruptedException {
        while(true) {
            int found = blockingQueue.take();
            System.out.println("Removing From the queue " + found);
            Thread.sleep(1000);
        }


    }

    public static void main(String[] args) {
        PracProdConsBlockingQueue queue = new PracProdConsBlockingQueue();
        Thread producer = new Thread(() -> {
            try {
                queue.producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                queue.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        producer.start();
        consumer.start();
    }
}
