package afternewgenprac.Multithreading;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) {
        // Create a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a task to the executor
        Future<Integer> future = executor.submit(() -> {
            System.out.println("Task is starting...");
            Thread.sleep(2000); // Simulate a long-running task
            return 42; // The result of the task
        });

        System.out.println("Task submitted. You can do other work here.");

        try {
            // Check if the task is completed
            if (!future.isDone()) {
                System.out.println("Task is not done yet...");
            }

            // Get the result (this blocks if the task is not completed)
            Integer result = future.get();
            System.out.println("Task completed. Result: " + result);

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shutdown the executor
            executor.shutdown();
        }
    }
}

