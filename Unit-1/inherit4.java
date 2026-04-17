
// Super keyword

class A {
    int x = 10;

    void show() {
        System.out.println("Parent class A");
    }
}

class B extends A {
    int y = 7;

    void display() {
        System.out.println(super.x);
        System.out.println("Class B");
    }
}

class C extends B {
    void check() {
        super.display();
        System.out.println("Class C");
    }
}

public class inherit4 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.check();
        obj.display();
    }
}
