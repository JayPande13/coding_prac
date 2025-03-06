package afternewgenprac.DSA.basicQues;

public class LongestSubstringWithAtlLeastKRepeating {
        public static void main(String[] args) {
            String s = "aaabbcddaeaaff";
            int k = 2;
            System.out.println("Longest substring length: " + longestSubstring(s, k)); // Output: 5
        }

        public static int longestSubstring(String s, int k) {
            // Base case: if string length < k, no valid substring possible
            if (s.length() < k) return 0;

            // Count frequency of each character in the current string
            int[] freq = new int[26]; // For lowercase a-z (0 = a, 1 = b, etc.)
            for (char c : s.toCharArray()) {
                freq[c - 'a']++; // Increment frequency (e.g., 'a' - 'a' = 0, 'b' - 'a' = 1)
            }

            // Check if all characters in the string meet the k requirement
            boolean allValid = true;
            for (int i = 0; i < s.length(); i++) {
                if (freq[s.charAt(i) - 'a'] < k) {
                    allValid = false; // Found a splitter
                    break;
                }
            }
            if (allValid) return s.length(); // Entire string is valid

            // Split string at characters with frequency < k and recurse
            int maxLength = 0;
            int start = 0;
            for (int i = 0; i < s.length(); i++) {
                if (freq[s.charAt(i) - 'a'] < k) { // Split at this character
                    String sub = s.substring(start, i); // Extract substring before split
                    maxLength = Math.max(maxLength, longestSubstring(sub, k)); // Recurse
                    start = i + 1; // Move start past the splitter
                }
            }
            // Handle the last substring after the final split
            if (start < s.length()) {
                String lastSub = s.substring(start);
                maxLength = Math.max(maxLength, longestSubstring(lastSub, k));
            }

            return maxLength;
        }
}
