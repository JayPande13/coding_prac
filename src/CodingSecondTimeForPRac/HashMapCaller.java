package CodingSecondTimeForPRac;

import java.util.ArrayList;
import java.util.Map;

public class HashMapCaller {
    public static void printHashMap(HashMap<String,Integer> hm){
        for(String s: hm.keySet()){
            System.out.print(s + " " + hm.get(s) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("Jay",24);
        hashMap.put("Deepak",32);
        hashMap.put("Rudra",12);
        hashMap.put("Vaibhav",22);
        hashMap.put("Naman",24);

        System.out.println(hashMap.remove("Naman"));
        System.out.println(hashMap.containsKey("Naman"));
        System.out.println(hashMap.get("Rudra"));


        printHashMap(hashMap);

    }
}
