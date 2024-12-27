package CodingSecondTimeForPRac;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

    public void insertionSorting(){
        int[] inputArray = {7,8,2,3,1};
        for(int i=1;i<inputArray.length;i++){
            int current = inputArray[i];
            int j = i-1;
            while(j>=0 && inputArray[j]>current){
                inputArray[j+1] = inputArray[j];
                j--;
            }
            inputArray[j+1] =current;
        }
        Arrays.stream(inputArray).forEach(res-> System.out.print(res + " "));
        System.out.println();
    }
}
