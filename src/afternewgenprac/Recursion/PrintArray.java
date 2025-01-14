package afternewgenprac.Recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr,0);
    }

    public static void printArray(int[] arr,int index) {
        if(index > arr.length-1) return;
        System.out.println(arr[index]);
        printArray(arr,index+1);
    }
}
