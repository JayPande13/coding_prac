package practice;

public class Factorial {

    public Integer getFactorial(Integer n){
        Integer factorial = 1;
        if(n.equals(1) || n.equals(0)) return 1;
        while(!n.equals(1)){
            factorial = factorial * n;
            n = n-1;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Factorial fac =  new Factorial();
//        Integer factorial = fac.getFactorial(5);
        Integer factorial = fac.getFactorialUsingRecussion(5);
        System.out.println(factorial);
    }

    public Integer getFactorialUsingRecussion(Integer x){
        if(!x.equals(1)){
            return x * getFactorialUsingRecussion(x-1); // 5 *4 *3*2
        }else return 1;

    }


}
