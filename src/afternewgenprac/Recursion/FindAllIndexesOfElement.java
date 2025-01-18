package afternewgenprac.Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindAllIndexesOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 4, 5,6,7,8,4,5,6,1,2,4};
        List<Integer> foundList = new ArrayList<>();
        findAllIndexesOfElement(arr,4,0,foundList);
        System.out.println(foundList.toString());
    }

    public static void findAllIndexesOfElement(int[] arr, int target, int index, List<Integer> foundList) {
        if(index > arr.length-1) return ;
        if(arr[index] == target) foundList.add(index);
        findAllIndexesOfElement(arr,target,index+1,foundList);
    }
}
