package afternewgenprac.Multithreading;

public class MultithreadingEvenOdd {
    static int counter;
    public static Object LOCK = new Object();
    public static boolean guard = true;

    public static void even() throws InterruptedException {
        synchronized (LOCK) {
            while (counter <= 100) {
                if (counter % 2 == 0) {
                    System.out.println("Even Number is :" + counter);
                    counter++;
                }
                if(!guard){
                    LOCK.notify();
                    guard=true;
                    LOCK.wait();
                }
            }
            LOCK.notify();
        }
    }

    public static void odd() throws InterruptedException {
        synchronized (LOCK) {
            while (counter <= 100) {
                if (counter % 2 != 0) {
                    System.out.println("Odd Number is :" + counter);
                    counter++;
                }
                if(guard){
                    guard=false;
                    LOCK.notify();
                    LOCK.wait();
                }
            }
            LOCK.notify();
        }

    }

    public static void main(String[] args) throws InterruptedException {
      Thread even = new Thread(()->{
          try {
              even();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      });

      Thread odd = new Thread(()->{
          try {
              odd();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      });
      odd.start();
      even.start();
      odd.join();
      even.join();
    }
}
