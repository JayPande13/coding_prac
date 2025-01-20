package afternewgenprac;


public class LongestIncreasingSubarray {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 7, 8, 6, 8, 1, 3};
        int[] longestSubarray = findLongestIncreasingSubarray(a);

        System.out.print("Longest increasing subarray: ");
        for (int num : longestSubarray) {
            System.out.print(num + " ");
        }
    }

    public static int[] findLongestIncreasingSubarray(int[] arr) {
        int maxLength = 1; // Minimum subarray length is 1
        int currentLength = 1;
        int startIdx = 0;
        int tempStartIdx = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
                tempStartIdx = i; // Update potential start index
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                startIdx = tempStartIdx; // Update start index of the longest subarray
            }
        }

        // Extract the longest increasing subarray
        int[] result = new int[maxLength];
        System.arraycopy(arr, startIdx, result, 0, maxLength);
        return result;
    }
}