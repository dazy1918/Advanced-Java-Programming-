interface Divisible {
    boolean number(int x);
}

public class lambda6 {
    public static void main(String[] args) {

        Divisible m = (a) -> (a % 3 == 0);

        System.out.println("Divisible = " + m.number(9));
        System.out.println("Divisible = " + m.number(101));
    }
}
