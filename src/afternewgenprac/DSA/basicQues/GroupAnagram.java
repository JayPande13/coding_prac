package afternewgenprac.DSA.basicQues;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> returnList = new ArrayList<>();
        for(String s : strs){
            char[] charArray = new char[26];
            for(char c : s.toCharArray()){
                charArray[c-'a']++;
            }
            String currString = new String(charArray);
            if(map.containsKey(currString)){
                map.get(currString).add(s);
            }else{
                map.put(currString,new ArrayList<>());
                map.get(currString).add(s);
            }
        }

        for(Map.Entry<String, List<String>> m : map.entrySet()){
            returnList.add(m.getValue());
        }
        return returnList;

    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagram ga = new GroupAnagram();
        System.out.println(ga.groupAnagrams(strs));
    }
}
