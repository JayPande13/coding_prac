package afternewgenprac.Multithreading;

public class PracEvenOdd {
    private Integer counter =1;
    private final Object lock = new Object();

    public void even() throws InterruptedException {
        synchronized (lock){
            while (counter <=100){
                if(counter%2==0){
                    System.out.println("Printing Even Number: " + counter++);
                }
                lock.notify();
                lock.wait();
            }
            lock.notify();
        }

    }

    public void odd() throws InterruptedException {
        synchronized (lock){
            while (counter <=100){
                if(counter%2!=0){
                    System.out.println("Printing Odd Number: " + counter++);
                }
                lock.notify();
                lock.wait();
            }
            lock.notify();
        }
    }

    public static void main(String[] args) {
        PracEvenOdd pracEvenOdd = new PracEvenOdd();
        Thread even = new Thread(()->{
            try {
                pracEvenOdd.even();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread odd = new Thread(()->{
            try {
                pracEvenOdd.odd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        even.start();
        odd.start();
    }
}
