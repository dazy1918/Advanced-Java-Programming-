//Min Method 

import java.util.*;
import java.util.stream.Stream;

public class streamapai9 {
    public static void amin(String[] args) {
        List<Integer> l1 = List.of(34, 56, 23, 56, 89, 12);

        int min l2 = l1.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(min);

        int max = l1.stream().max((x1,y1)-> x1.compareTo(y1)).get();
        System.out.println(max);
    }
}
