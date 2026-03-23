import java.util.*;
import java.util.stream.Stream;

public class practicestreamapi7 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(23, 67, 89, 54, 34, 21);

        //
        int product = l1.stream().reduce(1, (e1, e2) -> e1 * e2);
        System.out.println(product);

        // Find Maximum number using reduce()
        int MaxNum = l1.stream().reduce(0, (f1, f2) -> f1 > f2 ? f1 : f2);
        System.out.println(MaxNum);

        // Count total element using reduce()(without using count())
        int CountNum = l1.stream().reduce(0, (i1, i2) -> i1 + 1);
        System.out.println(CountNum);
    }
}
