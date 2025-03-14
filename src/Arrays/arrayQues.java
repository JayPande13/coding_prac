package Arrays;

import java.lang.reflect.GenericArrayType;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class arrayQues  implements Comparator<Integer> {

    public int[] reverseArray(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return arr;
    }

    public void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public int minimumValueInArray(int[] arr) {
        int minimum = arr[0];
        Optional<Integer> minusingStream ;
        int i = 1;
        while(i<arr.length){
            if(minimum >arr[i]){
                minimum = arr[i];
            }
            i++;
        }
        minusingStream = Arrays.stream(arr).boxed().min(Integer::compare);
        System.out.println(minusingStream.get());
        return minimum;
    }

    public static int secondMinimumValueInArray(int[] arr){
        int minimum = arr[0];
        int secondMinimum = arr[1];
        int i = 0;
        while(i<arr.length){
            if(minimum > arr[i]){
                int temp = minimum;
                minimum = arr[i];
                secondMinimum = temp;
            }
            i++;
        }
        Optional<Integer> secondMinimumStream = Arrays.stream(arr).boxed().sorted(Integer::compare).skip(1).findFirst();
        System.out.println(secondMinimumStream.get());
        return  secondMinimum;
    }

    public static int secondMaxValue(int[] arr){
        int maximum = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int i = 0;
        while(i < arr.length){
            if(arr[i] > maximum){
                secMax = maximum;
                maximum= arr[i];
            }else if(arr[i] > secMax && arr[i]!=maximum){
                secMax = arr[i];
            }

            i++;
        }

//        Optional<Integer> secondmaxStream = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
//        System.out.println(secondmaxStream.get());
        String input ="ABCD CDRT";
        String newString = input.chars().mapToObj(c->(char) c).collect(Collectors.toList()).reversed().stream().map(c -> String.valueOf(c)).collect(Collectors.joining());
        System.out.println(newString + "dsfgadsfdsa");
        return secMax;
    }

    public static void iteratorArray(){

        List<Integer> a = new ArrayList<>(List.of(1,2,3,4,5));
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();

        }
    }




        public int compare(Integer one, Integer two) {
            return Integer.compare(one, two);
        }

    public static void main(String[] args) {
        arrayQues ar = new arrayQues();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultingArray = ar.reverseArray(arr);
//        ar.printArray(resultingArray);
        int resultValue =  ar.minimumValueInArray(resultingArray);
//        System.out.printf("minimumValueInArray(arr)  " +  resultValue + "\n");
        int secondMinimum = secondMinimumValueInArray(resultingArray);
//        System.out.println(secondMinimum + "sodsfsdf");
        int secmax = secondMaxValue(resultingArray);
        System.out.printf("secondMinimumValueInArray(arr)  " +  secmax + "\n");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Optional<Integer> res = list.stream().max(new arrayQues());
//        System.out.println(res.get());

    }



}