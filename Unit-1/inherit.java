
//Multilevel Inheritance

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

class C extends B {
    void check() {
        System.out.println("class c");
    }
}

public class inherit {
    public static void main(String[] args) {
        C b = new C();
        b.show();
        b.display();
        b.check();
    }
}