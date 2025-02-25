package afternewgenprac.DSA.basicQues;

import java.util.*;

public class NextGreaterElement1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
//        List<Integer> num2List = new ArrayList<>();
//        for(int i: nums2){
//            num2List.add(i);
//        }
        for(int i : nums1){
                int greatest = Integer.MAX_VALUE;
                for(int j =0; j< nums2.length;j++){
                    if(j == nums2.length-1 && nums2[j] == i){
                        greatest =  -1;
                        break;
                    }
                    else if(nums2[j] > i && nums2[j] < greatest ){
                        greatest =  nums2[j];
                        break;
                    }
                }
//                for(int j: nums2){
//                    if(j > i && j < greatest){
//
//                    }
//                }
                if( greatest == Integer.MAX_VALUE){
                    arr.add(-1);
                }else{
                    arr.add(greatest);
                }
        }
        int[] returnArr = new int[arr.size()];
        int index = 0;
        for(int i :arr){
            returnArr[index++] = i;
        }

        return returnArr;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
