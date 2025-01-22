package afternewgenprac;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamQuestions {

    // Find the sum of numbers in a list using streams api
    public static void sumOfNumberInList() {
        List<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 34, 23));
        Integer sum = numList.stream().reduce(0, (ans, i) -> {
            return ans += i;
        });
        System.out.println("sumOfNumberInList : " + sum);
    }

    //we want first 3 even numbers in a list.
    public static void threeEvenNumberUsingStream() {
        List<Integer> list = List.of(1, 2, 4, 6, 8, 10);
        Set<Integer> intSet = list.stream().filter(num -> {
            return num % 2 == 0;
        }).limit(3).collect(Collectors.toSet());

        System.out.println("threeEvenNumberUsingStream : " + intSet);
    }

    // Find maximum and minimum in a list using streams
    public static void minAndMaxUsingStream() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Optional<Integer> Max = list.stream().max((a,b) -> Integer.compare(a,b));
        Optional<Integer> Min = list.stream().min((a,b) -> Integer.compare(a,b));


        System.out.println("minAndMaxUsingStream : Max : " + Max.get());
        System.out.println("minAndMaxUsingStream : Min : " + Min.get());
    }

    // By Creating Custom Comparator for the same.
    public class CustomComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1, o2);
        }
    }

    public static void minAndMaxUsingCustomComparator() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Creating object of outer class here because inner class is non-static class, and they are tied to the object not class itself.
        // hence creating object of inner class using outer class
        // Or you can make the inner class static so that this function can access it without making the object, or make this function non-static as well.
        streamQuestions streamQuestions = new streamQuestions();
        CustomComparator customComparator = streamQuestions.new CustomComparator();

        Optional<Integer> max = list.stream().max(customComparator);
        Optional<Integer> max2 = list.stream().max(new streamQuestions().new CustomComparator());

        System.out.println("minAndMaxUsingCustomComparator Max : " + max.get());
    }

    //get a list of distinct elements in a list using streams
    public static void distinctElementUsingStream() {
        List<Integer> a = new ArrayList<>(List.of(1, 2, 1, 1, 5));
        List<Integer> distinctElement = a.stream().distinct().toList();
        System.out.println("distinctElementUsingStream : " + distinctElement);
    }

    //collect duplicate elements in a list using stream
    public static void collectDuplicateElementUsingStream() {
        List<Integer> list = new ArrayList<>(List.of(1, 1, 2, 2, 3, 4, 5));
        //Collected Duplicate Elements to a list.
        List<Integer> duplicateElements = list.stream().filter(item -> Collections.frequency(list, item) > 1).toList();
//        Long count =  list.stream().collect(Collectors.counting());
//        System.out.println("Count : " + count); // 7 Output , Count of the elements

        //collect Duplicate element in map with its frequency
        HashMap<Integer, Long> frequencyMap = list.stream().collect(Collectors.groupingBy(i -> i, HashMap::new, Collectors.counting()));
        System.out.println("collectDuplicateElementUsingStream : " + duplicateElements);
    }

    //product of all the elements in a list
    public static void productOfAllElementsInList() {
        List<Integer> list = new ArrayList<>(List.of(1, 1, 2, 2, 3, 4, 5));

        Integer product = list.stream().reduce(1, (ans, r) -> ans = ans * r);
        System.out.println("productOfAllElementsInList : " + product);
    }

    //list of fruits names, and we want to sort it using streams on the basis of the length of the fruit
    public static void sortFruitOnBasisOfLengthOfFruit() {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pear");

        // If we want to reversed sorting
        fruits.stream().sorted((o1, o2) -> Integer.compare( o2.length(),o1.length())).forEach(System.out::println);
        //or
        fruits.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
        fruits.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(System.out::println);
    }

    static class Employee {
        String name;
        Integer age;

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Employee(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    //person with second-highest salary using streams
    public static void secondHighestSalaryUsingStream() {
        List<Employee> employeeList = List.of(new Employee("Jay", 24),
                new Employee("Hela", 78),
                new Employee("Sunio", 65),
                new Employee("greta", 23),
                new Employee("Phaluki", 76)
        );

        Optional<Employee> employee = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).skip(1).findFirst();
        //or
        Optional<Employee> employee2 = employeeList.stream().sorted((a,b)-> Integer.compare(b.getAge(),a.getAge())).skip(1).findFirst();
        if (employee.isPresent()) {
            System.out.println(employee.get());
        } else {
            System.out.println("not present");
        }
    }

    //Print a map using streams
    public static void printMapUsingStream() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Jay");
        hashMap.put(2, "Suru");
        hashMap.put(3, "Oirto");

        //Stream
//        hashMap.entrySet().stream().forEach(e->System.out.println("Printing Hash Map Values using Stream -> " + e.getKey() + " : " + e.getValue()));
        // Direct
        hashMap.forEach((key, value) -> System.out.println("Printing Hash Map Values -> " + key + " : " + value));
    }

    //Create a linked HashMap of integer array
    public static void linkedArrayUsingIntegerArray() {
        int[] a = {1, 2, 3, 4, 5};
        Map<Integer, Long> linkedMap = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(linkedMap);
    }

    // find the first element
    public static void firstElementOfString() {
        String s = "Spring boot".trim();
        Optional<Character> first = s.chars().mapToObj(c -> (char) c).findFirst();
        System.out.println("firstElementOfString : " + first.get());
    }

    // First Duplicate Element in the String
    public static void firstDuplicateElement() {
        String s = "Spring boot".trim();
        HashMap<Character, Long> duplicateMap = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, HashMap::new, Collectors.counting()));
        Optional<Character> firstDuplicate = duplicateMap.keySet().stream().filter(c -> duplicateMap.get(c) > 1).findFirst();
        System.out.println("firstDuplicateElement : " + firstDuplicate.get());
    }

    //stream from a string or char [] using java 8, and create a frequency map
    public static void createFrequencyMapOfStringCharacters() {
        String fruit = "apple";
        HashMap<Character, Long> stringFrequencyMap = fruit.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, HashMap::new, Collectors.counting()));
        stringFrequencyMap.forEach((key, value) -> System.out.println("key : " + key + " Value : " + value));
    }

    //string of string find the frequency using loop or using streams
    public static void wholeStringFrequency() {
        String string = "Hello How are you Hello How are you";
        HashMap<String, Long> frequencyMap = Arrays.stream(string.split(" ")).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        System.out.println("wholeStringFrequency : " + frequencyMap);

        // LinkedHashMap -> So that order of insertion remains preserved.
        HashMap<String, Integer> nonStreamFrequencyMap = new LinkedHashMap<>();
        for (String str : string.split(" ")) {
            nonStreamFrequencyMap.put(str,nonStreamFrequencyMap.getOrDefault(str,0) +1 );
        }
        System.out.println("wholeStringFrequency : " + nonStreamFrequencyMap);
    }

    //flatmap and map
    public  static void flatMapAndMap(){
        List<Integer> mapList = List.of(1,2,3,4,5,6,6);
        List<List<Integer>> flatMapList1 = List.of(List.of(22,33,44,55,66,77,88));

        List<Integer> mapResultList =  mapList.stream().map(r-> r*3).toList();
        /**
         * Flat map is used to straighten out the list of list (collection of collection)
         * It applies logic to all stream and convert them into single stream.
         * so that further operation can be done.
         */
        List<Integer> flatMapResultList = flatMapList1.stream().flatMap(wr-> wr.stream().map(r->r*3)).toList();

        System.out.println("flatMapAndMap Map : " + mapResultList );
        System.out.println("flatMapAndMap FlatMap : " + flatMapResultList );

    }

    public static void findSecondLargestNumberInIntegerArray(){
        int[] intArray = {1,2,3,4,5,6,7,33,55};
        Optional<Integer> secondHighestNumber = Arrays.stream(intArray).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondHighestNumber.ifPresent(System.out::println);

        // fetching 2nd Largest if not distinct
        int[] intArray2 = {1,2,3,4,5,6,7,33,55,55,53,66,54};
        Optional<Integer> secondHighestNumberDistinct = Arrays.stream(intArray).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondHighestNumberDistinct.ifPresent(System.out::println);
    }

    public static void creatingArray(){
        int[] intArray = new int[]{12,3,4,5,5};
        int[] intArray2 = {12,3,4,5,5};
    }

    public static void creatingThreads(){
        //1
        Thread thread = new Thread(()->{
            System.out.println("Jay");
        });

        //2
        Runnable runnable = ()->{
            System.out.println("Jay");
        };
        Thread thread2 = new Thread(runnable);



    }

    public static void reverseStringUsingReduce(){
        String str = "hello";
        String reversed = str.chars().mapToObj(c -> (char) c).reduce("",(ans,a)->{
            ans = a + ans;
                    return ans;
        },(ans1,ans2)-> ans1+ans2);

        System.out.println("ReversedStringUsingReduce : " + reversed);
    }


    public static void main(String[] args) {
        String s ="        fly me   to   the moon      ";
        s = s.replaceAll("\\s"," ").trim();
        List<String> stringList = List.of(s.split(" "));
//        System.out.println(s.trim());
//        sumOfNumberInList();
//        threeEvenNumberUsingStream();
//        minAndMaxUsingStream();
//        minAndMaxUsingCustomComparator();
//        distinctElementUsingStream();
//        collectDuplicateElementUsingStream();
//        productOfAllElementsInList();
//        sortFruitOnBasisOfLengthOfFruit();
//        secondHighestSalaryUsingStream();
//        printMapUsingStream();
//        linkedArrayUsingIntegerArray();
//        firstElementOfString();
//        firstDuplicateElement();
//        createFrequencyMapOfStringCharacters();
//        wholeStringFrequency();
//        flatMapAndMap();
//        findSecondLargestNumberInIntegerArray();
        reverseStringUsingReduce();


    }
}

