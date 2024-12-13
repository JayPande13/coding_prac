package afternewgenprac;

public class leetCode {

    public static int reverseInteger(int input){
        long reversedNumber = 0;
        while(input != 0){
            int lastDigit = input %10;
            reversedNumber = reversedNumber + lastDigit;
            reversedNumber = reversedNumber * 10;
            input = input / 10;
        }
        reversedNumber =  reversedNumber/10;
        if(reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE){
            return 0;
        }
        if(input < 0){
            return (int)(-1*reversedNumber);
        }
        return (int)reversedNumber;

    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(1534236469));
    }
}
