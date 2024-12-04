package JavaTrails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargest {
    public static void main(String[] args) {
        usingForEach();
//        secondTopUsingArrays();
//        secondTopUsingArrays();
    }

    public static void usingCollections(){
        List<Integer> list = Arrays.asList(1,2,3,4,11,6,7,10);
        System.out.println(Collections.max(list));
    }

    public static void usingForEach(){
        List<Integer> list = Arrays.asList(1,2,3,4,11,6,7,10);
        List<String> list1 = Arrays.asList("hello", "jay");

        String str = list1.stream().collect(Collectors.joining(" "));
        System.out.println(str);
        Integer max = Integer.MIN_VALUE;
        System.out.println(max);
        for(Integer number : list){
            if(number > max){
                max =  number;
            }
        }
        System.out.println("Largest number : " + max);
    }

    public static void secondTopUsingArrays(){
        int[] list = {1, 2, 3, 4, 11, 6, 7, 10};
        List<Integer> lt = Arrays.asList(1,2,3,4,5,3,6,5);
        Arrays.sort(list);
        int length = list.length;
        System.out.println(list[length-2]);

        // Learning
//        List newList = lt.stream().map(res -> res*2).collect(Collectors.toList());
//        System.out.println(newList);
    }

    public static void secondTopUsingForEach(){
        int[] list = {2, 1, 3, 4, 11, 6, 7, 10};
        int length = list.length;
//        int changer;
        for(int i=0;i<length;i++){
            for(int j =i+1 ;j<length;j++){
                if(list[i]>list[j]){
                    list[j] = list[j] + list[i]; // 3
                    list[i] = list[j] - list[i]; // 3- 2 =1
                    list[j] = list[j] - list[i];
//                   changer =  list[i] ;
//                   list[i] = list[j];
//                   list[j] =changer;
                }
            }
        }
        System.out.println(list[length-2]);
    }

}
