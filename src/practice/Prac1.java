package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class thread1 extends Thread{

    thread1(String name){
        this.setName(name);
    }
    @Override
    public void run(){
        int i =0;
        while(i<20){
            System.out.println("hello this is 1st try");
            i++;
        }
    }
}
class thread2 implements Runnable{
    @Override
    public void run(){
        int i =0;
        while(i<20){
            System.out.println("hello this is 2nd try" + ' ');
            i++;
        }
    }
}

public class Prac1 {

    public static void main(String[] args){
        // Mutiple of 3
//        List<Integer> a  = Arrays.asList(1,3,5,6,9,12,54,76,4,8,65);
//        a.stream().filter(res ->res % 3 == 0).forEach(System.out ::println);

        Thread runnableInterfaceThread = new Thread(new thread2());
        runnableInterfaceThread.start();
        thread1 t1 = new thread1("tester") ;
//        thread2 t2 = new thread2("rupesh") ;
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t2.start();
//        System.out.println( fact(5));

    }

    public static int fact(int number){
        if(number >=1){
            return number * fact(number -1);
        }
        return 1;
    }
}
