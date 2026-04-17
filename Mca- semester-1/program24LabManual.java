import java.util.ArrayList;

class Student {
    int roll_no;
    String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class program24LabManual {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Dazy"));
        list.add(new Student(2, "Deepanshi"));
        list.add(new Student(3, "Riya"));
        list.add(new Student(4, "Pooja"));

        for (Student student : list) {
            System.out.println("Roll no: " + student.roll_no + " Name: " + student.name);
        }
    }
}
