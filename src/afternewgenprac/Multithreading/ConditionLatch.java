package afternewgenprac.Multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionLatch {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();//is item avaliable
    private boolean isAvailable = false;
    static final CountDownLatch latch = new CountDownLatch(5);

    public void produce() throws InterruptedException {
        lock.lock();
        try {
            /*
            Why we're using a while loop here !!
            explanation : -

            We do this to prevent the condtion check, in case of any spurious
            wake ups !!!
             */
            while (isAvailable) {
                condition.await(); // Wait until the condition is signaled
            }
            System.out.println("Produced an item");
            isAvailable = true;
            condition.signal(); // Notify the consumer
        } finally {
            latch.countDown();
            lock.unlock();
        }
    }

    public void consume() throws InterruptedException {
        lock.lock();
        try {
            while (!isAvailable) {
                condition.await(); // Wait until the condition is signaled
            }
            System.out.println("Consumed an item");
            isAvailable = false;
            condition.signal(); // Notify the producer
        } finally {
            latch.countDown();
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ConditionLatch example = new ConditionLatch();

        Thread producer = new Thread(() -> {
            try {
                while (latch.getCount() != 0) example.produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (latch.getCount() != 0) example.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
        latch.await();
        System.out.println("Latch Finished");
    }
}
