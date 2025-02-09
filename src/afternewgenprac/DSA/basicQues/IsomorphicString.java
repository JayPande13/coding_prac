package afternewgenprac.DSA.basicQues;

import java.util.*;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                // for(Map.Entry<Character,Character> m : map.entrySet()){
                // if(m.getValue() == t.charAt(i) && m.getKey() != s.charAt(i)){
                // return false;
                // }
                // }
                if (set.contains(t.charAt(i)))
                    return false;
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
}
