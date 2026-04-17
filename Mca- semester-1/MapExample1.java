import java.util.*;

public class MapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("apple", 10);
        m.put("orange", 20);
        m.put("mango", 30);
        m.put("banana", 50);
        System.out.println(m);

        m.remove("banana");
        System.out.println("After removing the element " + m);

        if (m.containsValue(10)) {
            System.out.println("value 10 exist");
        }

        System.out.println("value " + m.containsValue(30) + " exist");

    }

}
