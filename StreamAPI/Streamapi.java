// Second Highest Number
import java.util.*;
import java.util.stream.*;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40);

        int result = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(result);
    }
}

