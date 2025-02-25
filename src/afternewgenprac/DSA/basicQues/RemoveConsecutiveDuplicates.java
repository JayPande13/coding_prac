package afternewgenprac.DSA.basicQues;

public class RemoveConsecutiveDuplicates {
    public static void stringDis(){
        String s = "AAABBBAACCBBBAA"; // YYYXYXX -> YXYX
        StringBuilder str = new StringBuilder();
        char[] c = s.toCharArray();
        for(int i =0;i<c.length; i++){
            if(i == 0 || c[i] != c[i-1]){
                str.append(c[i]);
            }
        }
        System.out.println(str.toString());

    }

    public static void main(String[] args) {
        stringDis();
    }

}
