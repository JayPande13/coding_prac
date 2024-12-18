package afternewgenprac;

public class BasicJavaQuestion {

    public static void isPalindrome() {
        int input = 1233421;
        int Remainder =0;
        int reversedElement = 0;
        int temp = input;
         while(input !=0){
             Remainder = input%10;
             reversedElement = reversedElement *10 + Remainder;
             input= input/10;
         }
        System.out.println(temp == reversedElement);
    }

    public static void isStringPalindrome(){
        String input ="abccba";
        boolean isPalindrome = true;
        for(int i = 0 ; i < input.length(); i++){
            if(input.charAt(i) != input.charAt(input.length()-1 - i))
                isPalindrome =false;
        }
        if (isPalindrome) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("Its Not a Palindrome");
        }
    }


    public static void fibonacci(int lengthOfFibonacci){
        int a = 0;
        int b =1;
        int c =0;
        System.out.print(a + " "+ b);
        while(lengthOfFibonacci != 0){
            c= a +b;
            a=b;
            b=c;
            System.out.print(" "+ c);
            lengthOfFibonacci --;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        isPalindrome();
        fibonacci(5);
        isStringPalindrome();
    }
}
