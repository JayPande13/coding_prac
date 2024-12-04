package JavaTrails;

import java.util.HashMap;

public class AnagramsPrac {
    public static void main(String[] args) {
//        noOfCharacters("aaaabbccdddd");
//        System.out.println( palindrome(121)); //123
        fibonacci(5);
    }

    public static void noOfCharacters(String input){
        HashMap<Character,Integer> result = new HashMap();
        for(int i=0;i<input.length();i++){
            char charater = input.charAt(i);
            if(result.containsKey(charater) && result.get(charater) != null){
                result.put(charater,result.get(charater)+1);
            }else{
                result.put(charater,1);
            }
            System.out.println(result);
        }
    }

    // need to study
    public static boolean palindrome(Integer input){
        int remainder =0;
        int temp = 0;
        int sum =0;
        temp =input;
        while(input!=0){
            remainder = input % 10;
            sum = (sum*10) + (remainder);
            input =input/10;
        }
        return temp == sum;
    }

    public static void fibonacci(Integer length){
        int arr[] = new int[100]; // spcified size of array = 100
        int a = 0;
        int b = 1;
        System.out.print(a + " " +b );
        while(length!=0 ){
            int c= a+b;
            System.out.print(" " +c);
            a =b;
            b= c;
            length --;
        }
    }
}
