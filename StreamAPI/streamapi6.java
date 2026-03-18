package streamapi;

import java.util.List;

public class streamapi6 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(10, 30, 34, 45, 23, 78, 10);
        long c2 = l1.stream().skip(2).limit(4).count();
        System.out.println(c2);

        long c = l1.stream().count();
        System.out.println(c);
    }
}
