package afternewgenprac.DSA.basicQues;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr ={1,5,2};
        int target = 2;
        System.out.println( findInMountainArray(target,arr));
    }
    public static int findInMountainArray(int target, int[] arr) {
        int peak = findPeak(arr);
        int targetIndex = findTarget(0,peak,arr,target);
        if(targetIndex < 0){
            targetIndex = findTarget(peak,arr.length-1,arr,target);
        }
        return targetIndex;
    }
    public static int findPeak(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(end > start){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start =mid +1;
            }
        }
        return start;
    }
    public static int findTarget(int start, int end, int[] arr,int target){
        while(end>=start){
            int mid = start + (end-start)/2;
            if(arr[mid]== target){
                return mid;
            }else if(arr[mid]> target){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
