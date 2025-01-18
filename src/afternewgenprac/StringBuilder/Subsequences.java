package afternewgenprac.StringBuilder;
import java.util.*;
public class Subsequences {

    public static class SubsequenceSort {
        public static List<String> subsequenceSort(String binary, String[] arr) {
            List<String> results = new ArrayList<>();

            for (String target : arr) {
                boolean possible = isPossible(binary, target);
                results.add(possible ? "YES" : "NO");
            }

            return results;
        }

        private static boolean isPossible(String binary, String target) {
            // Count available digits in binary
            int[] available = {0, 0}; // [0] for zeros, [1] for ones
            for (char c : binary.toCharArray()) {
                available[c - '0']++;
            }

            // Count required fixed digits in target
            int[] required = {0, 0}; // [0] for zeros, [1] for ones
            int questions = 0;
            for (char c : target.toCharArray()) {
                if (c == '0') required[0]++;
                else if (c == '1') required[1]++;
                else questions++;
            }

            // Check if we have enough digits for fixed positions
            if (required[0] > available[0] || required[1] > available[1]) {
                return false;
            }

            // For 111???, we need to check if it's possible to place three 1s at start
            if (required[1] > 0) {
                int oneCount = 0;
                for (char c : binary.toCharArray()) {
                    if (c == '1') oneCount++;
                    if (oneCount >= required[1]) break;
                }
                if (oneCount < required[1]) return false;
            }

            // Calculate remaining digits
            int remainingTotal = (available[0] - required[0]) + (available[1] - required[1]);

            // Check if remaining digits can fit in question marks
            return remainingTotal <= questions;
        }

        public static void main(String[] args) {
            String binary = "110100";
            String[] arr = {"?110?1", "111???"};

            List<String> results = subsequenceSort(binary, arr);
            for (String result : results) {
                System.out.println(result);
            }
        }
    }

}