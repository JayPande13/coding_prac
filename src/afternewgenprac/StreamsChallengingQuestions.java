package afternewgenprac;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsChallengingQuestions {

    public static void ReverseEachWordInAString() {
        String input = "Hello My Name Is Jay";
        String output =  input.chars().mapToObj(c -> (char) c).reduce("",(result,individualChar)->{
            result = individualChar + result  ; //he
            return result;
        },(a,b)-> a+b);
        System.out.println(output);

        String output2 = Arrays.stream(input.split(" ")).map(word ->word.chars().mapToObj(c -> (char)c).
                reduce("",(result,individualChar)->individualChar + result,(a,b)-> a+b)).collect(Collectors.joining(" "));

        System.out.println(output2);

    }

    public static void fibonacciUsingStream(){
        Stream.iterate(new long[]{0,1},pair -> new long[]{pair[1], pair[0] + pair[1]}) // pair is an array.
                .limit(5).map(pair -> pair[0])
                .forEach(a -> System.out.print(a + ", "));    }


    public static void main(String[] args) {
//        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
//        lock.readLock().lock();
//        ReverseEachWordInAString();
        fibonacciUsingStream();
    }
}
