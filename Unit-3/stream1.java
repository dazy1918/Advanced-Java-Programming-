
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class stream1 {
    public static void main(String[] args) {
        List<Integer> l3 = new ArrayList<>();
        l3.add(45);
        l3.add(87);
        l3.add(76);
        l3.add(98);

        Stream<Integer> s3 = l3.stream();

        List<Integer> l4 = s3
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(l4);
    }
}