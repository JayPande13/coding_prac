package JavaTrails;

public class PrimeNumber {
    public static void main(String[] args) {
        isNumberPrime(12);
    }

    public static void isNumberPrime(int input){
        boolean isPrime = true;
        int halfLength = input/2;
        if(input ==1 || input ==0) System.out.println("Number is Not a PRIME NUMBER");
        else {
            for (int i = 2; i <= halfLength; i++) {
                if (input % i == 0) {
                    System.out.println("Number is Not a PRIME NUMBER");
                    isPrime =false;
                    break;
                }
            }
            if(isPrime)System.out.println("Number is a PRIME NUMBER");
        }
    }
}
