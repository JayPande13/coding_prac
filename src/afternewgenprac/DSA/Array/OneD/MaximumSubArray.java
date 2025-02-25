package afternewgenprac.DSA.Array.OneD;

public class MaximumSubArray {
    public static int FindMaxSum(int[] nums){
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Update current sum: either start a new subarray or extend the current one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the max sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(FindMaxSum(arr));
    }
}
