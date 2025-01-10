package afternewgenprac.DSA.basicQues;

public class RotatedArray {

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(search(arr,0));
    }
    public static int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        int peak = findPeak(nums);
        if(peak == -1){
            return findTarget(start,end,nums,target);
        }
        if(nums[peak] == target){
            return peak;
        }else if(target >= nums[start]){
            return findTarget(start,peak,nums,target);
        }else {
            return findTarget(peak+1,end,nums,target);
        }
    }
    public static int findTarget(int start, int end,int[] arr, int target){
        while(end>=start){
            int mid = start + (end-start)/2;
            if(arr[mid]== target){
                return mid;
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return -1;
    }
    public static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(end>=start){
            int mid = start + (end-start)/2;
            if(end > mid && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid-1] > arr[mid]){
                return mid-1;
            }else if(arr[mid] >= arr[start]){
                start = mid+1;
            }else if(arr[start] > arr[mid]){
                end = mid-1;
            }
        }
        return -1;

    }
}
