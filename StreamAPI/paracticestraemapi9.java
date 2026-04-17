// Sum of Squares of Even Numbers
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        int sum = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}

//Convert Strings to Uppercase
import java.util.*;
import java.util.stream.*;

public class Q3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","stream");

        List<String> result = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}

//Frequency of Each Element
import java.util.*;
import java.util.stream.*;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,3,3);

        Map<Integer, Long> freq = list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println(freq);
    }
}

//Flatten List of Lists
import java.util.*;
import java.util.stream.*;

public class Q5 {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5)
        );

        List<Integer> result = list.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
