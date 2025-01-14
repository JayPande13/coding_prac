package afternewgenprac.Recursion;

public class towerHanoi {
    public static void main(String[] args) {
        towerHanoi(3, "A", "B", "C");
    }

    public static void towerHanoi(int n, String src, String dest,String helper) {
        if(n == 0) return;
        towerHanoi(n-1,src,helper,dest);
        System.out.println(n + " " + "[" + src + " -> " + dest + "]");
        towerHanoi(n-1,helper,dest,src);
    }
}
