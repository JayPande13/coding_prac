package C2;

public class ExtentingClass implements testInterface,test2interface{

    @Override
    public void calling() {
        testInterface.super.calling();
        test2interface.super.calling();
    }

    @Override
    public void add(int a ,int b){
        int sumtotal = a+ b;
        System.out.println(sumtotal);
    }
    @Override
    public void add(double a ,double b){
        double sumtotal = a+ b;
        System.out.println(sumtotal);
    }

    @Override
    public void abstractMethod(){
        System.out.println("testing abstract methods");
    }

    public static void main(String[] args) {
        testInterface test = new ExtentingClass();
        test2interface test2 = new ExtentingClass();
//        test.abstractMethod();
        test.add(2,5);
        test2.add(2,7);
        test.calling();
    }
}
