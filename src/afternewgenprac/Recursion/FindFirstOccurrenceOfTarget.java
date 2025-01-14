package afternewgenprac.Recursion;

public class FindFirstOccurrenceOfTarget {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7,6,8,9,2,1,7,5,7,9};
        System.out.println(findFirstOccurrenceBeforeRunningRecursion(arr,0,8));
    }

    public static int findFirstOccurrence(int[] arr, int index, int target) {
        if(index > arr.length - 1 ) return -1;
        int targetIndex = findFirstOccurrence(arr, index+1,target);
        if(arr[index] == target){
           return index;
        }else{
            return targetIndex;
        }

    }

    // This is the better approach because you don't have to iterate over whole array, rather
    // when you find the first index that is equal to the target you return that index
    public static int findFirstOccurrenceBeforeRunningRecursion(int[] arr, int index, int target) {
        if(index > arr.length - 1 ) return -1;

        if(arr[index] == target){
            return index;
        }else{
          return  findFirstOccurrenceBeforeRunningRecursion(arr, index+1, target);
        }
    }
}
