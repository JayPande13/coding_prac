package afternewgenprac.DSA.Stack;

import java.util.ArrayList;
import java.util.List;

public class StackImplUsingArrayList {
    static class ArrayStack{
        static List<Integer> stackList = new ArrayList<>();
        static int top;

        public static boolean isEmpty(){
            return stackList.isEmpty();
        }
        public static void push(int x){
            stackList.add(x);
            top++;
        }

        public static int pop(){
            if(stackList.isEmpty()) return -1;
            int returnTop = stackList.get(top-1);
            stackList.remove(top-1);
            top--;
            return returnTop;
        }

        public static int peek(){
            if(stackList.isEmpty()) return -1;
            return stackList.get(top-1);
        }

    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()){
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        System.out.println();
    }
}
