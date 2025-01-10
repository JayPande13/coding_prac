package afternewgenprac.DSA.basicQues;

import java.util.HashMap;

public class ContainDupicate2 {
    public  static  boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                int oldIndex = freq.get(nums[i]);
                if(Math.abs(i-oldIndex)<=k){
                    return true;
                }else{
                    freq.put(nums[i],i);
                }
            }else{
                freq.put(nums[i],i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,3,1,5};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
