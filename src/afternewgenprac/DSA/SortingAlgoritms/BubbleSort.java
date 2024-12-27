package afternewgenprac.DSA.SortingAlgoritms;

public class BubbleSort {
    // You move the largest element to the last of array. (length of array =n)
    // swapping takes place n-1-(number of sorted elements i.e. i) in each loop, it's not like we find out which element is largest and swap it only once, we check and swap each index.
    public static void bubbleSort() {
        int[] array ={2,5,6,4,9,8};
        // outer loop running < n-1 because when you are moving all the largest element to end, smallest one will automatically align in start, hence decreasing the loop count by 1
        // if this was not happening, we would have to run the loop one more time that will be <n .
        for(int i=0; i<array.length-1 ; i++) {
            // inner loop is dependent on outer loop such that we are eliminating checking the last element which is already sorted ( so when we start i =0; that means no element is sorted
            // but moving further in the loop we have i keeps on increasing, so we leave checking the sorted element.
            for(int j=0;j<array.length-1-i;j++){
                // swapping here is done for each index of like this 2 5 4 6 9 8 -> 2 5 4 6 8 9 when i =0 ; this will be final array after inner loop.
                if(array[j]>array[j+1]){
                    int temp = array[j];;
                    array[j]=array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for(int number : array){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        bubbleSort();
    }
}
