package afternewgenprac.Recursion;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        int n =5;
        printDecreasingIncreasing(n);
    }

    public static void printDecreasingIncreasing(int n) {
        if(n == 0) return;
        System.out.println(n);
        printDecreasingIncreasing(n-1);
        System.out.println(n);

    }
}
