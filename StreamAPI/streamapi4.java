//Remove Duplicate Characters from String
    import java.util.stream.*;

public class Q9 {
    public static void main(String[] args) {
        String str = "programming";

        String result = str.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
