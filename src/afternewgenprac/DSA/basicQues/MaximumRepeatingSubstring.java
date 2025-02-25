package afternewgenprac.DSA.basicQues;

public class MaximumRepeatingSubstring {
        public static int maxRepeating(String sequence, String word) {
            int maxRepeat = 0;
            StringBuilder repeatWord = new StringBuilder(word);

            while (sequence.contains(repeatWord.toString())){
                maxRepeat++;
                repeatWord.append(word);
            }
            return maxRepeat;
        }

    public static void main(String[] args) {
        System.out.println(maxRepeating("aaaba aaaba aaba aaaba aaaba aaaba aaaba","aaaba"));
    }
}
