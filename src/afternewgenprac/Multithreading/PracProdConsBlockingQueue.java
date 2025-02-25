package afternewgenprac.Multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PracProdConsBlockingQueue {
    int maxRange = 5;
    private final BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(maxRange);


    public void producer() throws InterruptedException {
        for(int i = 0; i < 20; i++) {
            blockingQueue.put(i);
            System.out.println("Added in the Queue" + i);
            Thread.sleep(1000);
        }

    }

    public void consumer(String name) throws InterruptedException {
        while(true) {
            int found = blockingQueue.take();
            System.out.println("Consumer Thread " + name +  " Removing From the queue " + found);
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
                queue.consumer("One");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer2 = new Thread(()->{
            try {
                queue.consumer("Two");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        producer.start();
        consumer.start();
        consumer2.start();
    }
}
