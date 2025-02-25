package afternewgenprac.DSA.basicQues;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicates {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(Arrays.asList(1,2,3,3,3,4,5,5,6));
        s.stream().filter(a -> Collections.frequency(s,a)>1).distinct().forEach(System.out::println);
    }
}
