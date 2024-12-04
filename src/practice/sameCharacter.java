package practice;

import java.util.Arrays;
import java.util.List;

public class sameCharacter {
    public static void main(String[] args) {
//        System.out.println(isCharaterSame("race","test"));
        System.out.println(countCharacter("race","care"));

    }

    public static boolean isCharaterSame(String a, String b){
        if(a.length() != b.length()) return false;
        else{
            char[] aChar = a.toCharArray();
            char[] bChar = b.toCharArray();

            Arrays.sort(aChar);
            Arrays.sort(bChar);
            return Arrays.equals(aChar,bChar);
        }
    }

    public static boolean countCharacter(String a, String b){
        if(a.length() != b.length()) return false;
        else{
            int[] count = new int[400];
            for(int i=0;i<a.length();i++){
                count[a.charAt(i)]++;
                count[b.charAt(i)]--;
            }

            for(int i =0;i<count.length;i++){
                if(count[i] !=0) return false;
            }
            return true;
        }
    }
}
