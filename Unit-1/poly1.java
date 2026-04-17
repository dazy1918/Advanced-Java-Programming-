// Polymorphism

class test {
    public int sum(int x, int y) {
        return x + y;
    }

    public float divide(float x, float y) {
        return x / y;
    }
}

public class poly1 {
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.sum(2, 7));
        System.out.println(t.divide(90, 3));
    }
}
