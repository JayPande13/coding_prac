package afternewgenprac;

import java.util.*;

public class JobTries {

    public static class LargestNumberByParitySwap {
        public static String getLargestNumber(String num) {
            if (num == null || num.length() <= 1) {
                return num;
            }

            char[] digits = num.toCharArray();
            int n = digits.length;

            // Optimize to a single pass
            for (int i = 0; i < n - 1; i++) {
                int digit1 = digits[i] - '0';
                int digit2 = digits[i + 1] - '0';

                // Check if both digits have the same parity and digit1 < digit2
                if (digit1 % 2 == digit2 % 2 && digit1 < digit2) {
                    // Swap the digits
                    char temp = digits[i];
                    digits[i] = digits[i + 1];
                    digits[i + 1] = temp;

                    // Reset the pointer to recheck previous swaps
                    if (i > 0) {
                        i -= 2;
                    }
                }
            }

            return new String(digits);
        }

        public static void main(String[] args) {
            String input = "1806579";
            String largestValue = getLargestNumber(input);
            System.out.println("Largest possible value: " + largestValue);
        }
    }

}
