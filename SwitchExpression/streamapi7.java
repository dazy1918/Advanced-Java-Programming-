//package streamapi;

import java.util.*;

public class streamapi7 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(10, 20, 30, 40, 34, 45, 23, 78, 10);

        List<Integer> l2 = l1.stream().skip(1).limit(4).toList();
        System.out.println(l2);

        // convert list to array
        Object arr[] = l1.stream().toArray();
        System.out.println(Arrays.toString(arr));
    }
}