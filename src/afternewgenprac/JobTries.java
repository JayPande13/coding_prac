package afternewgenprac;

import java.util.*;

public class JobTries {

    public static void main(String[] args) {
        List<Integer> list = List.of(4,4,4,1,1,1,1, 3,3,5,5,6,6,0,10) ;
//                Unique number in decreasing order of frequency
//        If same number print decreasing order-note
//        O/P - > 1,4, 6,5,3,  10,0

        Map<Integer, Integer > map = new HashMap<>();
        for(Integer i : list){
            map.put(i,map.getOrDefault(i,0)+1);
        }


         list.stream().distinct().sorted((a,b)->{
            int f = map.get(b).compareTo(map.get(a)); // sorting in desc order on the basis of freq.
            if(f==0){
                return b.compareTo(a); // if freq is same it should compare on the basis of value.
            }
            return f;
        }).forEach(a -> System.out.print(a + " , "));
    }

}
