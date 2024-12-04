package C2;

public interface testInterface {
    default void calling(){
        mode();
//        shape();
        System.out.println("called all private methods");
    }
    public void add(int a ,int b);
    public abstract void abstractMethod();

    private static void mode(){
        System.out.println("this is private static method mode");
    }

    private void shape(){
        System.out.println("this is private method shape");
    }
}
