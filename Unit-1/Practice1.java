
// Create a class vehicles with :

// * instance variable speed
// * parameterized constructor

class vehicles {

    int speed; // instance variable

    // Parameterized constructor
    vehicles(int speed) {
        this.speed = speed;
    }

    void display() {
        System.out.println("Speed: " + speed);
    }
}

public class Practice1 {
    public static void main(String[] args) {

        vehicles v = new vehicles(120);
        v.display();

    }
}
