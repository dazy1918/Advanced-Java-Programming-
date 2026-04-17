
// This keyword - We use it when:

class A {
    int x = 10;
}

class B extends A {
    int x = 20;

    void show() {
        System.out.println("Current class x: " + this.x);
        System.out.println("Parent class x: " + super.x);
    }
}

public class inherit5 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
