package afternewgenprac.Recursion;

// Its time complexity is O(logN)
public class PowerXNUsingXByTwo {
    public static void main(String[] args) {
        System.out.println(powerXNUsingXByTwo(3,11));
    }

    public static long powerXNUsingXByTwo(int x,int n) {
        if(n ==1) return x;
        long half =  powerXNUsingXByTwo(x, n/2);
        long full = half * half;
        if(n % 2 ==1) {
            full = full * x;
        }
        return full;

    }
}
