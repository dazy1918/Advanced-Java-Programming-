//1. Stack

//Stack is a class in java.util.

//Represents a last-in-first-out (LIFO) data structure.

//Think of it like a stack of plates: the last plate added is the first to be removed.

//Supports methods like: push(), pop(), peek(), isEmpty(), etc.

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // Adds an element to the top of the stack.
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack: " + s);

        // Removes and returns the top element of the stack.
        System.out.println("Top element: " + s.peek());

        // Returns the top element without removing it.
        System.out.println("Popped element: " + s.pop());
        System.out.println("Stack after pop: " + s);

        // Checks whether the stack is empty or not.
        // Returns true if empty, false otherwise.
        System.out.println("Is stack empty? " + s.isEmpty());
    }
}
