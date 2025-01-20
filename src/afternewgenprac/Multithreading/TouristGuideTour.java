package afternewgenprac.Multithreading;

import java.util.concurrent.CyclicBarrier;

public class TouristGuideTour {
    public static void main(String[] args) {
        int numTourists = 2; // Total number of tourists
        int numStages = 2;   // Total stages in the tour

        // Barrier action: Guide announces when all tourists are ready at a stage
        Runnable guideAction = () -> System.out.println("Guide: All tourists are ready! Moving to the next stage.");

        // CyclicBarrier with the number of tourists and a guide action
        CyclicBarrier barrier = new CyclicBarrier(numTourists, guideAction);

        // Create threads for each tourist
        for (int i = 1; i <= numTourists; i++) {
            int touristId = i;
            new Thread(() -> {
                try {
                    for (int stage = 1; stage <= numStages; stage++) {
                        System.out.println("Tourist " + touristId + ": Traveling to Stage " + stage + "...");
                        Thread.sleep(1000); // Simulate travel time to the stage
                        System.out.println("Tourist " + touristId + ": Arrived at Stage " + stage);

                        // Wait for other tourists at the barrier
                        barrier.await();

//                        System.out.println("Tourist " + touristId + ": Proceeding to the next stage.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
