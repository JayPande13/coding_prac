package afternewgenprac.DSA.basicQues;


import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(indexMap.containsKey((nums[i]))){
                int otherIndex = indexMap.get((nums[i]));
                return new int[]{otherIndex,i};
            }else{
                indexMap.put((target-nums[i]),i);
            }

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        twoSum(nums,9);
    }
}
