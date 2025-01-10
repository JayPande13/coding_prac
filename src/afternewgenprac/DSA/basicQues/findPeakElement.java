package afternewgenprac.DSA.basicQues;

public class findPeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(findPeakElementF(arr));
    }
    public static int findPeakElementF(int[] nums) {
        int start =0;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end- start)/2;
            // this condition means that the largest element is either the mid one, or it is left behind mid as, we are currently in the downfall of the array, so making end = mid so that we can check that is the greater element lies before it or not, assign to mid not to mid -1, as we don't know the value of mid-1, hence if mid will be greatest, we will lose its value.
            if(nums[mid] > nums[mid+1]){
                end = mid;
            }
            // this condition means that the largest element is in the next part of the array, we are at the climbing part right now, that's why the next element is greater than the current mid, so we update the value of the start to mid+1, not to mid because we already know that mid+1 is greater than mid, so why compare again.
            else if(nums[mid+1] > nums[mid]){
                start = mid +1;
            }
            // read at last -> these condition is put in such a manner that at the last, when all mid-assignments as done, and only one element will be left, then start and end will pointing to the same index. we are using start and end to find the max value in the array, and when they both are pointing to same index hence that index is the maximum.
            // each loop above return the maximum element in that loop, then we check for next part of the array on the basis of condition above, till only one element is left that is the maximum no.

        }
        return nums[start]; // can return end as well
    }
}
