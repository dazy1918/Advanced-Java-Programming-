// Abstract Class
abstract class Shape {

    // Abstract method
    abstract void calculate(int x, int y);

    // Non-abstract method
    void display() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {

    // Overriding abstract method
    void calculate(int l, int b) {
        int area = l * b;
        System.out.println("Area = " + area);
    }
}

class Dog {
    void food() {
        System.out.println("Dog is eating food");
    }
}

public class AbstractClass {

    public static void main(String[] args) {

        // Using Rectangle
        Rectangle r = new Rectangle();
        r.display(); // non-abstract method
        r.calculate(4, 5); // abstract method implemented

        // Using Dog
        Dog d = new Dog();
        d.food();
    }
}