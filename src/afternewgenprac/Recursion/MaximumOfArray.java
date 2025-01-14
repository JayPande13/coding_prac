package afternewgenprac.Recursion;

public class MaximumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 10, 6, 3};
        System.out.println(maximumOfArray(arr,0));
    }

    public static int maximumOfArray(int[] nums, int index) {
        if (index == nums.length - 1) return nums[index];
        int max = maximumOfArray(nums, index + 1);
        max = Math.max(max, nums[index]);
        return max;
    }
}
