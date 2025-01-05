package afternewgenprac.DSA.basicQues;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int maybeIndex = 0;
        for(int i =0; i< nums.length; i++){
            if(nums[i]== target)
                return i;
            else if(target < nums[i])
                maybeIndex ++;
            else if(target > nums[i])
                return maybeIndex;
        }
        return maybeIndex;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 5));
    }
}
