// Skip Method 

import java.util.List;

public class streamapi5 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(10, 30, 34, 45, 23, 78);
        List<Integer> l2 = l1.stream().skip(3).toList();
        System.out.println(l2);
    }
}