package C2;

public interface test2interface {
    default void calling(){
        mode();
        System.out.println("calling from c2");
    }

    private static void mode(){
        System.out.println("this is private static method mode in c2");
    }

    public void add(double a ,double b);

}
