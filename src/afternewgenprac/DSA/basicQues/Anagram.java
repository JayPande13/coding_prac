package afternewgenprac.DSA.basicQues;

import java.util.HashSet;
import java.util.Set;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        char[] arr = new char[26];
        for(int i =0;i < s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i =0;i < t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        for(int i =0;i < arr.length;i++){
            if(arr[i] ==1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("a","ab"));
    }
}
