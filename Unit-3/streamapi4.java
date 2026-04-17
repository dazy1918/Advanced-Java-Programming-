//Distinct Method

import java.util.List;

public class streamapi4 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(10, 30, 45, 56, 10, 6, 31, 30);
        l1.stream().filter(x -> x % 2 == 0).map(x -> x * x).reduce((x, x1) -> x + x1).distinct()
                .forEach(System.out::println);

    }
}
