
import java.util.*;

public class vector1 {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(50);
        vector.add(30);
        System.out.println(vector);
        System.out.println("Contains 10 ? " + vector.contains(10));
        System.out.println(vector.lastIndexOf(10));
        vector.remove(Integer.valueOf(10));
        System.out.println(vector);
    }
}