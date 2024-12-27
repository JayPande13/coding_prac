package afternewgenprac.DSA.SortingAlgoritms;

public class InsertionSort {
    public static void insertionSort(){
        int[] arr = {3,2,6,9,1,4};
        // here we assume that a part of the available array is already sorted, and we keep on adding elements from the unsorted part to the sorted part in the sorted manner.
        // outer loop is running to the i =1 to < length of array as we are assuming that the first element is the sorted part of the array.
        for(int i =1;i<arr.length;i++){
            int current = arr[i]; // I have stored element not the index.
            int j = i-1; // inner loop starting from index 0 as I have taken the size of sorted array as 1 in starting. and outer loop from index 1.
            while(j>=0 && arr[j]>current){ // if(j>=0 && 3>2)  -------> 1st loop j =0
                arr[j+1] = arr[j]; // changing position of j and j +1 i.e. index 0 and 1 => now array is this ->  _36914;
                j--; // j = -1 -> this will not go inside the loop
            }
            arr[j+1] = current; // adding value at zeroth index -> arr[0] = 2 (j = -1+1 = 0) => now array is 236914, and now sorted part is increased from only one index to 2 indices.
        }
        for(int nums : arr){
            System.out.print(nums + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        insertionSort();
    }
}
