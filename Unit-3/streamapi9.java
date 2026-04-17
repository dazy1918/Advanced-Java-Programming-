//Sorted Method

import java.util.*;
import java.util.stream.Stream;

public class streamapi9 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(34, 56, 23, 56, 89, 12);

        // sort (ascending order) -----1st way
        List<Integer> l2 = l1.stream().sorted().toList();

        // 2nd way (ascending order)
        List<Integer> l3 = l1.stream().sorted((x1, y1) -> x1.compareTo(y1)).toList();

        // sort (descending order) --- 1st way
        List<Integer> l4 = l1.stream().sorted(Comparator.reverseOrder()).toList();

        // 2nd way
        List<Integer> l5 = l1.stream().sorted((x2, y2) -> y2.compareTo(x2)).toList();

        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
    }
}
