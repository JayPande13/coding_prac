package afternewgenprac.Multithreading;

public class PracSatSun {

    private final Object lock = new Object();
    private boolean guard = false;
    // Saturday - Sunday - Saturday - Sunday -> put the locking notify and wait inside the loop
    // Saturday - all Sunday All -> Put the locking outside the loop

    public void Saturday() throws InterruptedException {
        synchronized (lock){
            for(int i =0; i < 10; i++){
                System.out.println("Print Saturday");
            }
                lock.notify();
                lock.wait();
//            lock.notify();

        }

    }

    public void Sunday() throws InterruptedException {
        synchronized (lock){
            for(int i =0; i < 10; i++){
                System.out.println("Print Sunday");
            }
                lock.notify();
                lock.wait();
//            lock.notify();
        }

    }

    public static void main(String[] args) {
        PracSatSun pracSatSun = new PracSatSun();
        Thread Saturday = new Thread(()->{
            try {
                pracSatSun.Saturday();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread Sunday = new Thread(()->{
            try {
                pracSatSun.Sunday();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Saturday.start();
        Sunday.start();
    }
}
