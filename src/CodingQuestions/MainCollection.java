package CodingQuestions;
import java.util.*;
import java.util.stream.Collectors;

public class MainCollection {

    // Function to check no of charters in a String
    public static void stringFilter(String n){
        char[] chartersList=  n.toCharArray();
        HashMap<Character,Integer> output = new HashMap<>();
        for(char c: chartersList){
            if(output.containsKey(c) && output.get(c)!= null){
                output.put(c,output.get(c)+1);
            }else{
                output.put(chartersList[c],1);
            }
        }
        System.out.println(output);
    }

    // function to reverse a string
    public static void stringReverser(String input){
//        String newString = "";
        StringBuilder newString = new StringBuilder(input);
        System.out.println(newString.reverse());
//        ABCD -> 93 94 92 93 -> {'A','B','C','D'} -> ['A','B','C','D'] -> ['D','C','B','A'] -> ["D","C","B","A"]-> "DCBA"
        String newStringt = input.chars().mapToObj(c->(char) c).collect(Collectors.toList()).reversed().stream().map(c -> String.valueOf(c)).collect(Collectors.joining());
        char[] inputCharaters = input.toCharArray();
//        System.out.println(inputCharaters);
//        for(int i= input.length()-1;i>=0;i--){
//            newString = newString + input.charAt(i);
////             char ch = inputCharaters[i-1];
////            newString.append(ch);
//
//        }
        System.out.println(newString);
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Durgesh");
        names.add("Jay");
        names.add("rest");
        names.add("test");

//        ArrayList test = new ArrayList();
//        test.add(11);
//        test.add("stest");
//
//        System.out.println(test.get(1));
//        names.stream().toArray()
//        names.removeIf(res -> res.equalsIgnoreCase("Durgesh"));
//        names.sort();
//        System.out.println(names);
//        stringFilter("aaaaaabbbbccc");
          stringReverser("ABCD");
    }

}
