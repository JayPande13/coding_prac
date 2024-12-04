package DataStructure;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};
        Arrays.asList(arr);
//        selectionSort(arr);
//        bubbleSort(arr);
        insertionSort(arr);
    }

    // shifting biggest index to last
    // current index > nex index then shift current index data = next index data and vice versa.
    public static void bubbleSort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.print("After outer Loop, after index: "+ i +" - ");
            Arrays.stream(arr).forEach(res -> System.out.print(res + " "));
            System.out.println();
        }
    }

    // shifting smallest index to first.
    // current index = smallest, if current index > next index,  then smallest is next index.
    public static void selectionSort(int arr[]){
        int smallest ;

        for(int i=0;i< arr.length-1;i++){
            smallest = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[smallest] >arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            System.out.print("After outer Loop, after index: "+ i +" - ");
            Arrays.stream(arr).forEach(res -> System.out.print(res + " "));
            System.out.println();
        }
    }

    public static void insertionSort(int arr[]){

        // starting from 1 as, assuming 1st element is sorted
        for(int i=1;i<arr.length;i++){
            // storing index element for comparison
            int current = arr[i];
            // creating inner loop index - for sorted array = i-1 -> because we took 1st element as sorted hence, sorted loop will start from 1 less
            // element from which above loop is started
            int j = i-1;
            // we have to check till then index of array should be in range (Not less than 0) also compare outer-loop element with all sorted element
            while(j >=0 && arr[j] >current ){
                // last sorted element is greater than next unsorted element, we  assign last sorted element to unsorted element's index
                arr[j+1] = arr[j];
                // decreasing inner loop index as when the outer loop proceeds , no.of element in sorted part will increase, hence we have to compare
                // the current unsorted element with all sorted element, to find its correct place in sorted part.
                j--;
            }
            // this will happen when all the shifting is done in sorted part to make place for the current comparing element (new unsorted element)
            // into its right index. this is done j+1 because, above while loop wil run till j =0; so there might be case where loop is out at -1 index,
            // hence increasing its index to 0 by (j+1) to place current (next unsorted element) in array.
            arr[j+1] =current;
            System.out.print("After outer Loop, after index: "+ i +" - ");
            Arrays.stream(arr).forEach(res -> System.out.print(res + " "));
            System.out.println();
        }
    }
}
