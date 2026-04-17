interface int1 {
    void show();
}

class Demo {
    public static void display() {
        System.out.println("reference to static method");
    }
}

public class methref1 {
    public static void main(String[] args) {

        int1 i1 = Demo::display; 
        i1.show();
    }
}
