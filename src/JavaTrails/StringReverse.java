package JavaTrails;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(stringReversal("HELLO"));
    }

    public static StringBuilder stringReversal(String input){
//        String reversedString ="";
        StringBuilder stb = new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            stb.append( input.charAt(i));
//            reversedString = reversedString + input.charAt(i);
        }
        return stb;
    }
}
