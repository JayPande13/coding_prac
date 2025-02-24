package afternewgenprac.DSA.Array.OneD;

public class RemoveDuplicatesWithoutFunctions {
    public  static void removeDuplicatesWithoutFunctions(int[] numbers) {
        int[] nonDuplicateArray = new int[numbers.length];
        int uniqueArrayIndex =0;
        for (int number : numbers) {
            boolean isDuplicate = false;
            for (int i : nonDuplicateArray) {
                if (i == number) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                nonDuplicateArray[uniqueArrayIndex] = number;
                uniqueArrayIndex++;
            }
        }
        for (int j : nonDuplicateArray) {
            if (j != 0) {
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1};
        removeDuplicatesWithoutFunctions(numbers);
    }


}
