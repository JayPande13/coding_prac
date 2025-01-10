package afternewgenprac.DSA.basicQues;

public class findElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,8,9,12,15,16,33,55,66,77,88,100,301};
        int target = 66;
        System.out.println(findElemInInfiniteArray(arr, target));
    }

    public static int findElemInInfiniteArray(int[] array,int target) {
        int start =0;
        int end = 1;
        int mid = -1;
        while(target > array[end]){
            int temp = end+1;
            end = end + (end- start + 1) * 2;
            start = temp;
        }
        while(start <= end){
            mid = start + (end - start) / 2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return mid;
    }
}
