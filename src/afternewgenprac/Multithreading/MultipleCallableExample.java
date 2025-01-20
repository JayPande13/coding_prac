package afternewgenprac.Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableExample {
    public static void main(String[] args) {

        // Create a list of Callable tasks
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            tasks.add(() -> {
                Thread.sleep(1000);
                return "Result from Task " + taskId;
            });
        }
        // Create a thread pool
        try(ExecutorService executor = Executors.newFixedThreadPool(3)) {
            // Submit all tasks and get a list of Future objects
            System.out.println("Starting tasks...");
            List<Future<String>> futures = executor.invokeAll(tasks);
            System.out.println("Finished tasks...");

            // Retrieve results from each Future
            System.out.println("Before Getting data from results");
            for (Future<String> future : futures) {
                System.out.println(future.get());
            }
            System.out.println("After Getting data from results");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
