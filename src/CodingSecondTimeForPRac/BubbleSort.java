package CodingSecondTimeForPRac;

import java.util.ArrayList;
import java.util.Arrays;


public class BubbleSort {

    public void bubbleSort(int[] inputList){ // length =5

        for(int i=0;i<inputList.length;i++){ // 0,1 2,3
            for(int j =0; j<inputList.length-i-1;j++){// 0,1,2,3 - 0,1,2 - 0
                if(inputList[j]>inputList[j+1]){
                    int temp = inputList[j];
                    inputList[j] = inputList[j+1];
                    inputList[j+1] = temp;
                }
            }
        }
        Arrays.stream(inputList).forEach(res-> System.out.print(res + " "));
        System.out.println();
    }
}
