package afternewgenprac.Multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceImpl {

    public static void main(String[] args) {
        try(ExecutorService executorService = Executors.newSingleThreadExecutor()){
            for (int i = 0; i < 10; i++) {
//            executorService.execute(new SingleThread(i));
            }
        }
        try(ExecutorService executorService = Executors.newFixedThreadPool(4)){
            for (int i = 0; i < 10; i++) {
//                executorService.execute(new FixedThread(i));
            }
        }
        try(ExecutorService executorService = Executors.newCachedThreadPool()){
            for (int i = 0; i < 100; i++) {
//                executorService.execute(new CachedThread(i));
            }
        }
        try(ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2)){
            for (int i = 0; i < 100; i++) {
                executorService.schedule(new ScheduledThread(i),2, TimeUnit.SECONDS);
                executorService.scheduleAtFixedRate(new ScheduledThread(i),2, 1,TimeUnit.SECONDS);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

class SingleThread implements Runnable{

    int sequence;

    public SingleThread(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public void run() {
        System.out.println("This is the Single Executor Thread executing : " + sequence + " times" + " by " + Thread.currentThread().getName());
    }
}

class FixedThread implements Runnable{

    int sequence;

    public FixedThread(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public void run() {
        System.out.println("This is the Fixed Executor Thread executing : " + sequence + " times" + " by " + Thread.currentThread().getName());
    }
}

class CachedThread implements Runnable{

    int sequence;

    public CachedThread(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public void run() {
        System.out.println("This is the Cached Executor Thread executing : " + sequence + " times" + " by " + Thread.currentThread().getName());
    }
}

class ScheduledThread implements Runnable{
    int sequence;
    public ScheduledThread(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public void run() {
        System.out.println("This is the Scheduled Executor Thread executing : " + sequence + " times" + " by " + Thread.currentThread().getName());
    }
}
