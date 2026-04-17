import java.util.*;

public class LinkedListQueue {
    public static void main(String[] args) {

        // Creating a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements (Enqueue)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue elements: " + queue);

        // Removing element (Dequeue)
        int removed = queue.remove();  // removes 10
        System.out.println("Removed element: " + removed);

        // Checking front element
        System.out.println("Front element (peek): " + queue.peek());

        // Queue after removal
        System.out.println("Queue after removal: " + queue);

        // Size of queue
        System.out.println("Queue size: " + queue.size());
    }
}
