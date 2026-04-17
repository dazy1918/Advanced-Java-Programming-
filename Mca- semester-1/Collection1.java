import java.util.*;

public class Collection1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        // add()
        l1.add(23);
        l1.add(67);
        l1.add(56);
        l1.add(80);

        // get()
        System.out.println("Element at index 2: " + l1.get(2));  // 56

        // contains()
        System.out.println("Contains 67? " + l1.contains(67));  // true
        System.out.println("Contains 100? " + l1.contains(100)); // false

        // set()
        l1.set(1, 999);  // replace index 1 (old value 67) with 999

        // addAll()
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(101);
        l2.add(105);
        l1.addAll(l2);

        System.out.println("Final List: " + l1);
    

        // 1. Normal for loop
        System.out.println("Normal For Loop:");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        // 2. Enhanced for-each loop
        System.out.println("For-Each Loop:");
        for (Integer n : l1) {
            System.out.println(n);
        }

        // 3. Iterator loop
        System.out.println("Iterator:");
        Iterator<Integer> it = l1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
