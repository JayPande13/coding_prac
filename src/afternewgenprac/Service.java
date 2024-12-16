package afternewgenprac;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Service {
    public static void main(String[] args) {
//        try (ExecutorService service = Executors.newCachedThreadPool()) {
//            for (int i = 0; i < 10; i++) {
//                service.execute(new Task(i));
//                service.execute(new Task2(i));
//            }
//        }
    }

    static class Task implements Runnable {

        int name;

        public Task(int name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("number of the task1 is : " + this.name + " thread being used : " + Thread.currentThread().getName());
        }
    }

    static class Task2 implements Runnable {

        int name;

        public Task2(int name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("number of the task2 is : " + this.name + " thread being used : " + Thread.currentThread().getName());
        }
    }
}
