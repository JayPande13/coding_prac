package afternewgenprac.DSA.basicQues;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String inputString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i =0; i< inputString.length();i++){
            if(inputString.charAt(i) != inputString.charAt(inputString.length()-1-i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
