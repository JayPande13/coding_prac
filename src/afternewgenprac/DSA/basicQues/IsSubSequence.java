package afternewgenprac.DSA.basicQues;

public class IsSubSequence {
    public static boolean isSubsequence(String s, String t) {
        int pointer1 = 0;
        int pointer2 = 0;

        while(pointer1 < s.length() && pointer2 < t.length() ){
            if(s.charAt(pointer1) == t.charAt(pointer2)){
                pointer1++;
            }
            pointer2++;
        }
        return pointer1 == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
