@FunctionalInterface
interface Operation {
    int display(int x);
}

public class lambda1 {
    public static void main(String[] args) {

        // With one parameter
        Operation square = (a) -> a * a;
        System.out.println("Square = " + square.display(4));
    }
}
