package afternewgenprac.Recursion;

public class PrintArrayInReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArrayInReverse(arr,0);
    }

    public static void printArrayInReverse(int[] arr,int index) {
        if(index > arr.length - 1) return;
        printArrayInReverse(arr,index+1);
        System.out.println(arr[index]);
    }
}
