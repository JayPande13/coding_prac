package afternewgenprac.DSA.basicQues;

import java.util.*;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = Integer.MIN_VALUE;
        Set<Character> charSet = new HashSet<>();
        for(int right =0; right <s.length();right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(right));
                left++;
            }
            Math.max(maxLength,right-left+1);

            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();
        System.out.println(ls.lengthOfLongestSubstring("abcabcbb"));
    }
}
