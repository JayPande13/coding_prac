package afternewgenprac.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureExample {
    public static void main(String[] args) {

        // Define a Callable task
        Callable<Integer> task = () -> {
            System.out.println("Performing a computation...");
            Thread.sleep(2000); // Simulate a long-running task
            return 42; // Return a result
        };

        // Perform other operations while the task is running
        System.out.println("Doing other work...");

        // Create a thread pool using ExecutorService
        try (ExecutorService executor = Executors.newSingleThreadExecutor()){
            // Submit the task and get a Future object
            Future<Integer> future = executor.submit(task);
            // Retrieve the result of the Callable
            System.out.println("Before Fetching the Future");
            Integer result = future.get(); // Blocks until the result is available
            System.out.println("Result of the computation: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
