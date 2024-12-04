package inheritence;

public class Child extends Parent {

    @Override
    public void run() {
        System.out.println("Run from Child");
    }

    public void test(){
        System.out.println("Public method from Child");
    }
}
