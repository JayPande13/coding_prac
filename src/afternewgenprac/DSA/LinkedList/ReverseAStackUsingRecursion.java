package afternewgenprac.DSA.LinkedList;

import java.util.Stack;

public  class ReverseAStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(reverseStack(stack));
    }

    public static Stack<Integer> reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty()) return stack;
        int top = stack.pop();
        Stack<Integer> reversedStack = reverseStack(stack);
        pushToBottom(reversedStack, top);
        return reversedStack;

    }

    public static void pushToBottom(Stack<Integer> stack, int element) {
        if(stack.isEmpty()) {
            stack.push(element);
            return;
        }
        int currentTop = stack.pop();
        pushToBottom(stack, element);
        stack.push(currentTop);

    }
}
