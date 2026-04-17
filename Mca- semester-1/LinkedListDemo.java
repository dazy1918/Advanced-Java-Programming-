import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        // LinkedList is used for insertion and deletion
        LinkedList<Integer> l1 = new LinkedList<>();

        // add()
        l1.add(23);
        l1.add(67);
        l1.add(56);
        l1.add(80);

        System.out.println(l1);
        l1.offerFirst(200); 
        // adds 200 at the beginning
        System.out.println(l1);
        System.out.println(l1.peek());  
        //It returns the first element of the list without removing it.
        l1.poll(); //Delete 
        System.out.println(l1);
        l1.set(0,500); //Replace the first element (index 0) with 500
        //It does not add or remove elements — it only updates the value at that position.
        System.out.println(l1);

    }
}
