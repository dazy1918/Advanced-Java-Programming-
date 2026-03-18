//Distinct Method
package streamapi;

import java.util.List;

public class streamapi4 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(10, 30, 45, 56, 10, 6, 31, 30);
        l1.stream().distinct().forEach(System.out::println);

    }
}
