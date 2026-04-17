
// Multiple inheritance -  without Using interface

class A {
    void show() {
        System.out.println("Hello from A");
    }
}

class B extends A {
}

class C extends A {
}

// In Java, a class cannot extend more than one class.

class D extends B, C { }  // ❌ Confusion

public class inherit3 {
    public static void main(String[] args) {
        D b = new D();
        b.show();
       
    }
}