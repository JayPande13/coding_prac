package CodingSecondTimeForPRac;

public class sortingCaller {

    public static void main(String[] args) {
        BubbleSort bs= new BubbleSort();
        SelectionSort ss = new SelectionSort();
        InsertionSort is= new InsertionSort();
        int[] a ={1,22,5,56,78,2,3,8,3,32,75,76,12,78} ;
        bs.bubbleSort(a);
        ss.selectionSorting(a);
        is.insertionSorting(a);
    }


}
