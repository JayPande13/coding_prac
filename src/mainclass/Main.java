package mainclass;


public class Main {

    public static boolean stingIdentifier (){

        String a = "test";
        String b = "care";
        boolean isAnagram = true;

        if (a.length() != b.length()) {
            isAnagram = false;
        } else {
            int[] charCount = new int[256];

            for (int i = 0; i < a.length(); i++) {
                charCount[a.charAt(i)]++;
                charCount[b.charAt(i)]--;
            }

            for (int i = 0; i < charCount.length; i++) {
                if (charCount[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        return isAnagram;
    }



    public static void main(String[] args) {

        System.out.println(stingIdentifier());
    }


}