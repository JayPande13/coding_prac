package afternewgenprac;

public class Parent implements AutoCloseable {

    public Object speak(){
        System.out.println("testing");
        return null;
    }

    public static void up(Object c){
        System.out.println("Sout level");
    }

    public static void up(String s){
        System.out.println("Sout level");
    }

    public void speak2(){}


    @Override
    public void close() throws Exception {

    }

    public static void main(String[] args) {
        
    }
}
