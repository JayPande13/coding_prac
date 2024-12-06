package JavaTrails;

import java.util.*;
import java.util.stream.Collectors;

public class ListDuplicacy {
    List<Integer> test = new ArrayList();

    public static void main(String[] args) {
        ListDuplicacy ld = new ListDuplicacy();
        ld.test.add(1);
        ld.test.add(2);
        ld.test.add(2);
        ld.test.add(3);
        ld.test.add(3);
        ld.test.add(4);
        ld.test.add(4);

        long count = ld.test.stream().distinct().count();
        List<Integer> ditinctList = ld.test.stream().distinct().toList();

        if(count < ld.test.size()){
            ld.test.stream().filter(d -> Collections.frequency(ld.test,d)>1).distinct().forEach(System.out::println);
        }

        // Looping in Hash Map
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,1);
        hm.put(2,2);
        hm.put(3,3);
        hm.put(4,4);
        hm.put(5,5);

        Set set = hm.entrySet();

        Iterator itr =  set.iterator();

        for(Map.Entry me : hm.entrySet());
    }


}
