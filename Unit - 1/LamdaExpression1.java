interface liesbetween {
    boolean c(int a, int b, int c);
}

public class LamdaExpression1 {
    public static void main(String[] args) {
        liesbetween ig = (a, b, n) -> n > a && n < b;

        System.out.println(ig.c(1, 8, 20));

    }
}