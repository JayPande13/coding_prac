package afternewgenprac.Multithreading;

import java.util.ArrayList;
import java.util.List;

public class PracProducerConsumer {
    List<Integer> continerList = new ArrayList<>();
    int counter = 0;
    int Max = 3;
    int min = 0;
    private final Object lock = new Object();

    public void Produce() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                while (continerList.size() == Max) {
                    lock.wait();
                }
                continerList.add(++counter);
                System.out.println("Added in Container " + counter);
                lock.notify();
                Thread.sleep(1000);
            }
        }

    }

    public void Consume() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (continerList.size() == min) {
                    lock.wait();
                }
                int removedElement = continerList.removeFirst();
                System.out.println("Removed from container " + removedElement);
                lock.notify();
                Thread.sleep(1000);
            }
        }

    }

    public static void main(String[] args) {
        PracProducerConsumer pracProducerConsumer = new PracProducerConsumer();
        Thread producer = new Thread(() -> {
            try {
                pracProducerConsumer.Produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                pracProducerConsumer.Consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        producer.start();
        consumer.start();
    }

}
