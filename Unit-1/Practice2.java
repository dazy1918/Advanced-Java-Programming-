
// Create a class car that 

// * calls parent constructor using super
// * adds brand variable
// * display both values 

class car1 {
    int x;

    car1(int x) {
        this.x = x;
        System.out.println("Parent constructor called");
    }

    void show() {
        System.out.println("Parent class car");
    }
}

class car2 extends car1 {

    String brand;

    car2(int x, String brand) {
        super(x);
        this.brand = brand;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Value of x: " + super.x);
    }
}

public class Practice2 {
    public static void main(String[] args) {
        car2 c = new car2(10, "BMW");
        c.display();
        c.show();
    }
}
