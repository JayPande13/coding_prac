package Codes;

import java.util.Map;
import java.util.TreeMap;

public class Ques {

    public static void main(String args[])
    {
        TreeMap<Integer,Integer> tm = new TreeMap();
        tm.put(1,10);
        tm.put(2,11);
        tm.put(3,12);
        tm.put(7,14);
        tm.put(4,13);

        for(Map.Entry me :tm.entrySet()){
            System.out.println(me.getValue() + " ---> "  + me.getKey());
        }
    }
}
