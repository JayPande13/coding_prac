package afternewgenprac;

import java.util.ArrayList;
import java.util.List;

public class Child extends Parent{
    // Testing Thins
    private List<A> subscribers = new ArrayList<>();
    private A a ;


    public static void something(){
        System.out.println("Calling");
    }

    @Override
    public Integer speak() {
        return 0;

    }

    @Override
    public void close() throws Exception {
        System.out.println("test");
    }
}
