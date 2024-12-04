package JavaTrails;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(palindromeString("ABCDABCDDCBADCBA"));
    }

    public static Boolean palindromeString(String input){
        int length = input.length();
        for(int i =0;i<length;i++){
            if(input.charAt(i) != input.charAt(length-1-i)){
                return false;
            }
        }
        return  true;

    }
}
