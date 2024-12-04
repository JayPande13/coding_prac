package HackerRank;

import java.util.Scanner;

public class LexographicalOrder {

    public static String getSmallestAndLargest(String s, int k) {
        String current = s.substring(0,k);
        String smallest = current;
        String largest = current;

        for(int i =k ; i< s.length();i++){
            current = current.substring(1,k) + s.charAt(i);
            if(largest.compareTo(current) <0){
                largest = current;
            }
            if(smallest.compareTo(current)>0){
                smallest = current;
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

//Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
//Input:
//welcometojava
//3

//Output
//ava
//wel

// 11 - 3 length string wil be formed.
