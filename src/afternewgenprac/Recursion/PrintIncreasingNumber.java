package afternewgenprac.Recursion;

public class PrintIncreasingNumber {
    public static void main(String[] args) {
        int n =5;
//        printIncreasingNumberWithOne(n);
        printIncreasingUsingLargeNumber(n);
    }

    public static void printIncreasingNumberWithOne(int n) {
        if(n==6){
            return;
        }
        System.out.println(n);
        printIncreasingNumberWithOne(n+1);
    }

    public static void printIncreasingUsingLargeNumber(int n) {
        if(n==0){
            return;
        }
        printIncreasingUsingLargeNumber(n-1);
        System.out.println(n);
    }
}
