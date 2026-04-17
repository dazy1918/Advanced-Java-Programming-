// Overloading Method through inheritance

class test {
    public int sum(int x, int y) {
        return x + y;
    }
}

class test1 extends test {
    public int sum(int x, int y) {
        return x / y;
    }
}

public class poly3 {
    public static void main(String[] args) {
        test1 t = new test1();
        System.out.println(t.sum(200, 5));

    }
}
