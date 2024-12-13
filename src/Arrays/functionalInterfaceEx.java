package Arrays;

    @FunctionalInterface
public interface functionalInterfaceEx {

        int add(int a, int b);

    public class Demo{
        public static void Main(){


            functionalInterfaceEx addition = (a, b) -> a+b;


            int result = addition.add(10,20);

            System.out.println(result);
        }
    }
}
