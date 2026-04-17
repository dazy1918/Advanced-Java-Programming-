
// Hybrid Inheritance

interface A {
    void show();
}

interface B {
    void display();
}

class C { // Single inheritance
    void message() {
        System.out.println("Class C");
    }
}

class D extends C implements A, B { // Hybrid: C + A + B

    public void show() {
        System.out.println("Interface A method");
    }

    public void display() {
        System.out.println("Interface B method");
    }
}

public class inherit2 {
    public static void main(String[] args) {
        D obj = new D();
        obj.message();
        obj.show();
        obj.display();
    }
}
