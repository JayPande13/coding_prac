package afternewgenprac;

import java.util.*;
import java.util.stream.Collectors;

public class Child extends Parent {
    // Testing Thins
    private List<A> subscribers = new ArrayList<>();
    private A a;


    public static void something() {
        System.out.println("Calling");
    }

    @Override
    public Integer speak() {
        return 0;

    }

    public static void up(){
        System.out.println("Up");
    }

    @Override
    public void close() throws Exception {
        System.out.println("test");
    }

    public static void main(String[] args) {
        List<Map<String, Integer>> listOfMap = new ArrayList<>();
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("key1", 2);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("key2", 3);
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("key3", 1);
        listOfMap.add(map1);
        listOfMap.add(map2);
        listOfMap.add(map3);

    }
}
