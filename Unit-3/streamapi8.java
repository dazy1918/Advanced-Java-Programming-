import java.util.*;
import java.util.stream.Stream;

public class streamapi8 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(10, 34, 56, 34, 78);

        Optional<Integer> x = l1.stream().reduce((e1, e2) -> e1 + e2);

        System.out.println(x);

        // 2nd way

        // e1 = 0;
        // e2 = starting value which is 10;

        int sum = l1.stream().reduce(0, (e1, e2) -> e1 + e2);
        System.out.println(sum);

        // 3rd way

        String str1 = l1.stream()
                .map(String::valueOf)
                .reduce("", (e1, e2) -> e1.concat(e2));
        System.out.println(str1);

    }
}