import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 7, 89, 43, 80 };
        IntStream s = Arrays.stream(arr);
        s.forEach(x -> System.out.println(x));

        // 2. Value
        Stream<Integer> s2 = Stream.of(2, 8, 6, 9, 5, 3, 0, 4);
        s2.forEach(x -> System.out.println(x));

        // 3. Collections
        List<Integer> l3 = new ArrayList<>();
        l3.add(45);
        l3.add(87);
        l3.add(76);
        l3.add(98);

        Stream<Integer> s3 = l3.stream();
        s3.forEach(x -> System.out.println(x));
    }
}
