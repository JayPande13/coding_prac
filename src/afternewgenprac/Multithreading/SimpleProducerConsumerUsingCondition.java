package afternewgenprac.Multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BoundedQueue {
    private final int[] buffer;
    private int count = 0, putIndex = 0, takeIndex = 0;
    private final Lock lock = new ReentrantLock();
    private final Condition notEmpty = lock.newCondition();
    private final Condition notFull = lock.newCondition();

    public BoundedQueue(int size) {
        buffer = new int[size];
    }

    // Produce method to add an item to the queue
    public void produce(int value) throws InterruptedException {
        lock.lock();
        try {
            while (count == buffer.length) {
                notFull.await(); // Wait if the queue is full
            }
            buffer[putIndex] = value;
            putIndex = (putIndex + 1) % buffer.length;
            count++;
            System.out.println("Produced: " + value);
            notEmpty.signal(); // Signal that the queue is not empty
        } finally {
            lock.unlock();
        }
    }

    // Consume method to remove an item from the queue
    public int consume() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) {
                notEmpty.await(); // Wait if the queue is empty
            }
            int value = buffer[takeIndex];
            takeIndex = (takeIndex + 1) % buffer.length;
            count--;
            System.out.println("Consumed: " + value);
            notFull.signal(); // Signal that the queue is not full
            return value;
        } finally {
            lock.unlock();
        }
    }
}

public class SimpleProducerConsumerUsingCondition {
    public static void main(String[] args) throws InterruptedException {
        BoundedQueue queue = new BoundedQueue(3); // Queue with a capacity of 3 items

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.produce(i); // Produce items from 1 to 5
                    Thread.sleep(10); // Simulate some time for producing an item
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.consume(); // Consume items (total 5)
                    Thread.sleep(150); // Simulate some time for consuming an item
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start both threads
        producer.start();
        consumer.start();

        // Wait for both threads to finish
        producer.join();
        consumer.join();

        System.out.println("All threads completed.");
    }
}

