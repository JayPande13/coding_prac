package RedoAgainInterviewPracFeb.DSA;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
//        bubbleSort(arr);
        selectionSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for(int i =0; i< arr.length -1; i++){
            for(int j= 0 ;j < arr.length-1-i;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        for(int i =0; i< arr.length-1; i++){
            int smallestIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallestIndex] > arr[j]){
                    smallestIndex = j;
                }
            }
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        // Need to Study.
    }
}
