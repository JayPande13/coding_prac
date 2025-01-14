package afternewgenprac.Recursion;

public class PrintDecreasingNumber {
    public static void main(String[] args) {
        int n = 5;
        printDecreasingNumber(n);
    }
    public static void printDecreasingNumber(int n) {
        if(n == 0) return;
        System.out.println(n);
        printDecreasingNumber(n-1);
    }
}
