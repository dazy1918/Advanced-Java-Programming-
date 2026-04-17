
//Hierarchical Inheritance

class A {
    void show() {
        System.out.println("Parent class A ");
    }
}

class B extends A {
    void display() {
        System.out.println("class B");
    }
}

class C extends A {
    void check() {
        System.out.println("class c");
    }
}

public class inherit1 {
    public static void main(String[] args) {
        C b = new C();
        b.show();
        b.check();
    }
}