package afternewgenprac.DSA.basicQues;

import java.util.*;

public class singleNumber {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for(Integer key : freqMap.keySet()){
            if(freqMap.get(key) == 1){
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = {2,2,1};
//        System.out.println(singleNumber(nums)) ;
    }
}
