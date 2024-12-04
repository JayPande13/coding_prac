package C2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class coder {

    public static boolean stingFilter(String a, String b){
        int stringALenght = a.length();
        int stringBlength = b.length();

        if(stringBlength != stringALenght) return false;
        else{
            int[] count = new int[256];
            for(int i=0; i< stringALenght; i++){
                count[a.charAt(i)]++;
                count[b.charAt(i)]--;
            }

            for(int i=0; i< count.length; i++){
                if(count[i]!= 0 ) {
                    return false;
                }
            }
        }


        return true;
    }

    public static boolean stringIndentifier(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] stringAList = a.toCharArray() ;
        char[] stringBList =b.toCharArray();

        Arrays.sort(stringAList);
        Arrays.sort(stringBList);
        return Arrays.equals(stringAList,stringBList);

    }

    public static void main(String[] args) {
//        List<employee> employees = new ArrayList<>();
//        List<Integer> oddEven = List.of(2, 5, 6, 34, 78, 99, 55);
//        oddEven.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
//        employees.add()
        boolean isAnagram = stingFilter("listen","silent");
        boolean isAnagram1 = stringIndentifier("race","care");
        System.out.println(isAnagram1);
    }
}
