
// This keyword - We use it when:

// * Instance variable and local variable have same name

// * To call current class method

//  * To call current class constructor

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id; // instance variable = local variable
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class thiskeyword {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Dazy");
        s1.display();
    }
}
