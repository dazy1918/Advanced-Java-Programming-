import java.util.Scanner;

public class SwitchStatement5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine();
        int result = switch (ch) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '=' -> a = b;
            default -> -1;
        };
        System.out.println(result);
    }
}
