package JavaTrails;

public class fibonacci {
    public static void main(String[] args) {
//        System.out.println(ispalindrone(123321));
        fibonacci(5);

    }

    public static boolean ispalindrone(int number){
        int sum = 0;
        int remainder = 0;
        int temp = number;
        while(number != 0){
            remainder = number % 10;
            sum = sum *10+ remainder;
            number= number/10;
        }
        return temp == sum;

    }

    public static void fibonacci(int length){
        int a =0;
        int b =1;
        int c =0;
        System.out.print(a + "  " + b);
        while(length != 0){
            c= a+b;
            a=b;
            b=c;
            System.out.print(" " + c + " ");
            length --;
        }
    }
}
