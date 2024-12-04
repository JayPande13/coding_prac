package CodingQuestions;

import java.util.Stack;

public class PushToBottomOfStack {

    public static void pushToBottom(int data, Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushToBottom(data,stack);
        stack.push(top);
    }

    public static void reversingList(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reversingList(stack);
        pushToBottom(top,stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushToBottom(4,stack);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
