package CodingSecondTimeForPRac;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

    public void selectionSorting(int[] inputArray){
        for(int i=0;i<inputArray.length;i++){
            int smallest = i;
            for(int j=i+1;j<inputArray.length;j++){
                if(inputArray[smallest] > inputArray[j]){
                    smallest = j;
                }
            }
            int temp = inputArray[i];
            inputArray[i] = inputArray[smallest];
            inputArray[smallest] =temp;
        }
        Arrays.stream(inputArray).forEach(res -> System.out.print(res + " "));
        System.out.println();
    }
}
