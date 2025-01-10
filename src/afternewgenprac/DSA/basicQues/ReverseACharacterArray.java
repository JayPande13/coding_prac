package afternewgenprac.DSA.basicQues;

import java.util.ArrayList;
import java.util.List;

public class ReverseACharacterArray {
    public static void reverseString(char[] s) {
        List<Character> reversedS = new ArrayList<>();
        for(int i = s.length-1;i>=0;i--){
            reversedS.add(s[i]);
        }
    }

    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
    }
}
