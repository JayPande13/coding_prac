package afternewgenprac.Recursion;

public class FindLastOccurrenceOfTarget {
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 8, 5, 8, 7,8};
        System.out.println(findLastOccurrence(arr,0,8));
    }

    public static int findLastOccurrence(int[] arr, int index,int target) {
        if(index > arr.length-1) return -1;
        int targetIndex = findLastOccurrence(arr, index+1, target);
        if(targetIndex == -1 && arr[index] == target) {
            return index;
        }else{
            return targetIndex;
        }
    }
}
