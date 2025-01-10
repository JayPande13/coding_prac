package afternewgenprac;

public class JobTries {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.display();
        sample =null;
        sample.display();
    }
}

class Sample{
    public static void display(){
        System.out.println("dummy");
    }
}
