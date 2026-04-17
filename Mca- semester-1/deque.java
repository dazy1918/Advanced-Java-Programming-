import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // Adding elements
        dq.add(10);       // add at end
        dq.add(20);
        dq.add(30);
        dq.addFirst(5);   // add at front

        System.out.println("Deque: " + dq);

        // Peek last
        System.out.println("Peek Last: " + dq.peekLast());   // shows last element

        // Poll last
        System.out.println("Poll Last (deleted): " + dq.pollLast()); // removes last element

        // After deletion
        System.out.println("Deque after pollLast: " + dq);
    }
}
