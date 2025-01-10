package afternewgenprac.DSA.basicQues;

public class Ransom {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int i =0;
        String s = "abc";
        s.toCharArray();
        StringBuilder sb = new StringBuilder(magazine);
        while(i<ransomNote.length()){
            int index = sb.indexOf(String.valueOf(ransomNote.charAt(i)));
            if( index > -1)
                sb.deleteCharAt(index);
            else
                return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }
}
