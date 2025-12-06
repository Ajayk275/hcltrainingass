package collecction;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");
        stack.push("Yellow");

        System.out.println("Stack Elements: " + stack);

   
        System.out.println("Top Element (Peek): " + stack.peek());

     
        System.out.println("Popped Element: " + stack.pop());

        System.out.println("Stack After Pop: " + stack);

       
        System.out.println("Position of 'Green': " + stack.search("Green"));

    
    }
}
