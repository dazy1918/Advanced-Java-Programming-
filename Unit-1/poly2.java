// Overridding Method

class test {
    public float sum(float x, float y) {
        System.out.println("Parent class");
        return x + y;
    }

}

class child extends test {
    public float sum(float x, float y, float z) {
        System.out.println("Child class");
        return x / y + z;
    }
}

public class poly2 {
    public static void main(String[] args) {
        child t = new child();
        System.out.println(t.sum(20, 2, 70));

    }
}
