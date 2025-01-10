package afternewgenprac.DSA.basicQues;

import java.util.Arrays;

public class MoveZeroToFront {
    public static void moveZeroToFront(int[] nums) {
        int i = nums.length - 1;
        int j = i - 1;
        while (j >= 0) {
            if (nums[i] == 0) {
                if (nums[j] != 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i--;
                }
                j--;
            } else {
                i--;
                j--;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
    public static void main(String[] args) {
        int[] arr = {6, 1, 0, 4, 0, 9, 5, 0}; //
        moveZeroToFront(arr);
    }
}
