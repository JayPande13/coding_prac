package afternewgenprac;

public class Parent implements AutoCloseable {

    public Object speak(){
        System.out.println("testing");
        return null;
    }

    public void speak2(){}


    @Override
    public void close() throws Exception {

    }
}
