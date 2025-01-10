package afternewgenprac;

public class CustomStringBuilder {
    char[] originalArray;
    int capacity = 10;

    CustomStringBuilder(String input) {
        char[] originalArray = new char[capacity];
        for (int i = 0; i < input.length(); i++) {
            originalArray[i] = input.charAt(i);
        }
    }

    public CustomStringBuilder append(String input){
        if(originalArray.length + input.length() > capacity){

        }

        return this;

    }
}
