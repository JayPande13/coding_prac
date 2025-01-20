package afternewgenprac.Multithreading;

public class PracHelloWorld {
    // Print Hello First then World, Hello World - Hello World 10 time

    private final Object lock = new Object();
    private boolean guard = false;

    public void hello() throws InterruptedException {
        synchronized (lock){
            for(int i =0; i < 10; i++){
                System.out.print("Hello ");
                if(!guard){
                    guard = true;
                    lock.notify();
                    lock.wait();
                }
            }
            lock.notify();
        }
    }

    public void world() throws InterruptedException {
        synchronized (lock){
            for(int i =0; i < 10; i++){
                System.out.print("World ");
                if(guard){
                    guard = false;
                    System.out.println();
                    lock.notify();
                    lock.wait();
                }
            }
            lock.notify();
        }
    }

    public static void main(String[] args) {
        PracHelloWorld pracHelloWorld = new PracHelloWorld();
        Thread hello = new Thread(()->{
            try {
                pracHelloWorld.hello();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread world = new Thread(()->{
            try {
                pracHelloWorld.world();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        hello.start();
        world.start();
    }

}
