sealed class Vehicle permits Car, Bike{  // sealed Class
    public void start(){
        System.out.println("Vehicle started");
    }
}
final class Car extends Vehicle{  //Final Class
    public void run(){
        System.out.println("Car is running");
    }
}
non-sealed class Bike extends Vehicle{  // Non-sealed Class
    public void run(){
        System.out.println("Bike is running");
    }
}

public class sealedclass {
    public static void main(String[] args){
    Vehicle v = new Vehicle();
    v.start();   
     Car c = new Car();
     c.run();
     Bike b = new Bike();
     b.run();
    }
}
