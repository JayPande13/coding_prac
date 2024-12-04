package inheritence;

public class MainRunner {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.run();


        Child child = new Child();
        child.run();
        child.test();
    }
}
