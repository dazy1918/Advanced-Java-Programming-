class Student {
    int age;

    void showAge() {   // instance method
        System.out.println(age);
    }
}

public class InstanceMethod1 {
    public static void main(String[] args) {
        Student s1 = new Student(); // object create
        s1.age = 20;
        s1.showAge();  // instance method call
    }
}




