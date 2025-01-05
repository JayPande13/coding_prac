package afternewgenprac;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class Service {
    public static void main(String[] args) {
//        int Cores = Runtime.getRuntime().availableProcessors();
//        System.out.println(Cores);
        try (ExecutorService service = Executors.newCachedThreadPool()) {
            for (int i = 0; i < 1; i++) {
                service.execute(new Task(i));
//                service.execute(new Task2(i));
            }
        }

        Service s = new Service();
        Runnable run = () -> {
            System.out.println("rung");
        };
//        Stream.iterate(0, i -> i + 1).limit(10).forEach(System.out::println);\
        Something<Integer> something = new Something<>(); // k--- integer
        List<Integer> list = new ArrayList<>(); // l --- integer
        something.add(list);
    }

    static class Task extends Task2 {
        public Task(int id) {
            super(id);
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

    static class Something<T> {
        T data;

        void add(List<?> list) {
            System.out.println(3);
        }
    }

    static <K> K add(Something<K> d) {
        return d.data;
    }


}
