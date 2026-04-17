// Upcasing Method

class test {
    public int sum(int x, int y) {
        System.out.println("Parent class");
        return x + y;
    }

}

class child extends test {
    public int sum(int x, int y, int z) {
        System.out.println("Child class");
        return x / y + z;
    }
}

public class poly4 {
    public static void main(String[] args) {
        test t = new child();
        System.out.println(t.sum(20, 2));

    }
}
