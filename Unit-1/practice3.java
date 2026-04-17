
class car1 {
    int x = 10;

    void show() {
        System.out.println("Parent class car");
    }
}

class car2 extends car1 {

    void display() {
        System.out.println(super.x);
    }
}

public class practice3 {
    public static void main(String[] args) {

        car2 c = new car2();

        c.display();
        c.show();
    }
}