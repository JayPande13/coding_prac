package afternewgenprac.Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class MultithreadingProducerConsumer {
    public MultithreadingProducerConsumer( int top, int bottom) {
        this.containerList = new ArrayList<>();
        this.top = top;
        this.bottom = bottom;
    }

    int counter;
    final List<Integer> containerList;
    final int top;
    final int bottom;
    public final Object Lock = new Object();


    public void producer() throws InterruptedException{
        synchronized (Lock) {
            while (true) {
                if (!(containerList.size() == top)) {
                    System.out.println("Added new counter to the container : " + counter);
                    containerList.add(counter++);
                    Lock.notify();
                } else {
                    System.out.println("Container is Full waiting for removal ---");
                    Lock.wait();
                }
                Thread.sleep(500);
            }
        }
    }

    public void consumner() throws InterruptedException{
        synchronized (Lock) {
            while (true) {
                if (!(containerList.size() == bottom)) {
                    System.out.println("Removed element from the container : " + containerList.removeFirst());
                    Lock.notify();
                } else {
                    System.out.println("Container is Empty waiting for adding ---");
                    Lock.wait();
                }
                Thread.sleep(500);
            }
        }
    }

}

class ProducerConsumerCaller{
    public static void main(String[] args) {
        MultithreadingProducerConsumer multithreadingProducerConsumer = new MultithreadingProducerConsumer(5,0);
        Thread producer = new Thread(()->{
            try {
                multithreadingProducerConsumer.producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer = new Thread(()->{
            try {
                multithreadingProducerConsumer.consumner();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        producer.start();
        consumer.start();
    }

}

