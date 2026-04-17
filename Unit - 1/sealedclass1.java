sealed class Vehicle permits Car, Bike {
    public void start() {
        System.out.println("Vehicle started");
    }
}

final class Car extends Vehicle {
    public void run() {
        System.out.println("Car is running");
    }
}

non-sealed class Bike extends Vehicle {
    public void run() {
        System.out.println("Bike is running");
    }
}

public class sealedclass1 {
    public static void main(String[] args) {

        // Car object
        Car c = new Car();
        c.start();
        c.run();

        System.out.println("----------------");

        // Bike object
        Bike b = new Bike();
        b.start();
        b.run();

        System.out.println("----------------");

        // Polymorphism
        Vehicle v = new Car();
        v.start();
    }
}
 
