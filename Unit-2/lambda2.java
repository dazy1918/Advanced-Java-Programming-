@FunctionalInterface
interface Calculator {
    int calculate(int x, int y);
}

public class lambda2 {
    public static void main(String[] args) {

        // Lambda expressions for arithmetic operations
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;

        System.out.println("Addition = " + add.calculate(5, 10));
        System.out.println("Subtraction = " + sub.calculate(5, 10));
        System.out.println("Multiplication = " + mul.calculate(5, 10));
        System.out.println("Division = " + div.calculate(5, 10));
    }
}
