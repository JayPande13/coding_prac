package afternewgenprac;

import java.util.Collections;

public class doubtTrail implements A,B{

    // You have to override this method compulsory, so that this method doesn't create ambiguity
    @Override
    public void call() {
        B.super.call();
        // can give any implementation or call the method of any interface in the above manner
    }

    public static void main(String[] args) {
        String s = "abc"; // created in string pool
        String z ="abc";
        String sb= new String("abc"); // created in heap memeory
        String a = sb.intern(); // moving sb to string pool then java automatically check that this string already lies in the string poll hence just assign the reference
        System.out.println(s==sb); //false
        System.out.println(s==z); //true
        System.out.println(s.equals(sb)); // true
        System.out.println(s==a); // true

        Parent trailClassB = new Child();
//        TrailClassA trailClassA = new TrailClassA();
//        trailClassA.something();
//        trailClassB.something();
    }
}
