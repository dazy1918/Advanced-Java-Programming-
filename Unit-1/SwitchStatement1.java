import java.util.Scanner;

public class SwitchStatement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 5;
        System.out.println("Enter an operation (+, -, *, /): ");
        char ch = sc.next().charAt(0);
        int result = switch (ch) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> {
                System.out.println("Invalid operation entered.");
                yield -1;
            }
        };

        System.out.println("Result: " + result);

        sc.close();
    }
}
