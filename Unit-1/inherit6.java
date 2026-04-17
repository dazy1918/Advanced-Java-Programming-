
// this() and super() in Constructor

class A {
    A() {
        System.out.println("Parent constructor");
    }
}

class B extends A {
    B() {
        this(100); // Calls another constructor of same class
        System.out.println("Child default constructor");
    }

    B(int x) {
        super(); // Calls parent constructor
        System.out.println("Child parameterized constructor: " + x);
    }
}

public class inherit6 {
    public static void main(String[] args) {
        B b = new B();
    }
}
