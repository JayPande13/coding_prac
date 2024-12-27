package afternewgenprac.DSA.SortingAlgoritms;

public class SelectionSort {
    // You have to move the smallest element to the starting of the array.
    // in this swapping happens only once per inner loop, we check for each element that is that greater than the smallest element that we are setting to the outer index,
    // if yes we are updating the value of that variable and swapping it only once after the inner loop.
    public static void selectionSort(){
        int[] arr = {2,4,5,7,1,9};
        //outer loop runs to < length - 1 because when we move all the small elements to the start the largest one will be automatically moved to the last, if this was not happening
        // then we have to run the outer loop till < length
        for(int i=0; i< arr.length-1;i++){
            // setting up the smallest index to be i, in every loop.
            int smallestIndex = i;
            // inner loop runs from i+1 as we have taken the smallest element to be i and hence we have to compare the elements that are after that,
            // that if they are smaller than what we have set to be the smallest
            // and only the index setting is done inside the loop
            for(int j =i+1;j<arr.length;j++){
                if(arr[smallestIndex] > arr[j]){
                    smallestIndex = j;
                }
            }
            // swapping is done here after finalizing the smallest element for this loop.
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        selectionSort();
    }
}
