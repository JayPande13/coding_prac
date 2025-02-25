package afternewgenprac.DSA.basicQues;

public class NumberOfSegmentInString {
    public static int countSegments(String s) {
        String[] arr = s.split(" ");
//        s.indexOf()
        if (arr.length == 1 && arr[0].equals("")) return 0 ;
        return arr.length;
    }

    public static void main(String[] args) {
        System.out.println(countSegments(""));
    }
}
