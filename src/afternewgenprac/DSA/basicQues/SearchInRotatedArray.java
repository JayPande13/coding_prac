package afternewgenprac.DSA.basicQues;

public class SearchInRotatedArray {

    public static void main(String[] args) {
        int[] arr = {1};
        int ans = search(arr,0);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target) {
        int targetIndex = -1;
        int peak = findPeak(nums);
        int start = 0;
        int end = nums.length - 1;
        if (peak == -1) {
            return findTarget(start, end, nums, target);
        } else {
            if (nums[peak] == target) {
                return peak;
            } else if (target >= nums[start]) {
                end = peak -1;
                targetIndex = findTarget(start,end, nums, target);
            } else if (nums[start] > target) {
                start = peak +1;
                targetIndex = findTarget(start, end ,nums, target);
            }
        }
        return targetIndex;

    }
    public static int findPeak(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(end>=start){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(start > mid && arr[mid-1]> arr[mid]){
                return mid-1;
            }
            else if(arr[start] > arr[mid]){
                end = mid-1;
            }
            else if(arr[start] < arr[mid]){
                start = mid+1;
            }
        }
        return -1;
    }

    public static int findTarget(int start, int end, int[] arr, int target){
        while(end>=start){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
}
