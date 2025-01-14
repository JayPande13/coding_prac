package afternewgenprac.Recursion;

public class PowerXN {
    public static void main(String[] args) {
        System.out.println(power(4,4));
    }

    public static int power(int x, int n) {
        if(n == 1) return x;
//        if(n == 0) return 1; -> Will Work with this as well, but one more time the power(2,0) will be called, skipping that by return x, at level power(2,1);
        int pnm1 = power(x,n-1);
        int pn = pnm1 * x;
        return pn;
    }
}
