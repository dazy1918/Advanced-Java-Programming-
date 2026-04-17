
class Employee {
    int id;
    String name;

    // Parameterized Constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    Employee(Employee emp) {
        this.id = emp.id;
        this.name = emp.name;
    }

    void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

public class construct1 {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Dazy");

        Employee e2 = new Employee(e1); // Copy constructor

        e1.display();
        e2.display();
    }
}
