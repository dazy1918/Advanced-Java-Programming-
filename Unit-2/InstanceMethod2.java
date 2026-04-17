interface Int1 {
    String show(String s);
}

interface Int2 {
    int cal(String s);
}

public class InstanceMethod2 {
    public static void main(String[] args) {

        // reference to instance method of arbitrary object

        Int1 i1 = String::toUpperCase;
        System.out.println(i1.show("java"));

        Int2 i2 = String::length;
        System.out.println(i2.cal("java"));
    }
}


