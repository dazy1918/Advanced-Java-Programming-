//Find Longest String
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","springboot","api");

        String result = list.stream()
                .max(Comparator.comparingInt(String::length))
                .get();

        System.out.println(result);
    }
}

//Group Strings by Length
import java.util.*;
import java.util.stream.*;

public class Q7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hi","hello","hey");

        Map<Integer, List<String>> result = list.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(result);
    }
}

//Partition Even & Odd
import java.util.*;
import java.util.stream.*;

public class Q8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        Map<Boolean, List<Integer>> result = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(result);
    }
}
