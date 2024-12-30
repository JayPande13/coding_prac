package afternewgenprac.Multithreading;

public class MultithreadingSaturdaySunday {
    public static Object Lock = new Object();


    public static void staturday() throws InterruptedException {
        synchronized (Lock){
           for(int i=0; i<10;i++){
               System.out.println("Saturday");
               Lock.notify();
               Lock.wait();
           }
        Lock.notify();
        }
    }

    public static void sunday() throws InterruptedException {
        synchronized (Lock){
            for(int i=0; i<10;i++){
                System.out.println("Sunday");
                Lock.notify();
                Lock.wait();
            }
            Lock.notify();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread satThread= new Thread(()->{
            try{
                staturday();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread sunThread = new Thread(()->{
            try{
                sunday();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        satThread.start();
        sunThread.start();
//        satThread.join();
//        sunThread.join();
    }
}
