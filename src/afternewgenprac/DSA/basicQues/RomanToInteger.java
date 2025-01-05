package afternewgenprac.DSA.basicQues;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int i = 0;
        int j = i + 1;
        int output = 0;
        int stringLength = s.length();
        HashMap<Character, Integer> romanToNumericMap = new HashMap<>();
        romanToNumericMap.put('I', 1);
        romanToNumericMap.put('V', 5);
        romanToNumericMap.put('X', 10);
        romanToNumericMap.put('L', 50);
        romanToNumericMap.put('C', 100);
        romanToNumericMap.put('D', 500);
        romanToNumericMap.put('M', 1000);

        while (j < stringLength ) {
            if (romanToNumericMap.get(s.charAt(i)) >= romanToNumericMap.get(s.charAt(j))) {
                output = output + romanToNumericMap.get(s.charAt(i));
            } else if (romanToNumericMap.get(s.charAt(j)) >= romanToNumericMap.get(s.charAt(i))) {
                output = output + (romanToNumericMap.get(s.charAt(j)) - romanToNumericMap.get(s.charAt(i)));
                i++;
                j++;
            }
            i++;
            j++;
        }
        if(i == stringLength-1) output = output + romanToNumericMap.get(s.charAt(i));
        return output;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

}
