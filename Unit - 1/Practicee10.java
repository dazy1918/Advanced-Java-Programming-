// write a java program to extract the names of students from a list of Student object using map()

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Practicee10 {
    public static void main(String[] args) {

        List<Student> stud = Arrays.asList(
                new Student(1, "xyz"),
                new Student(2, "alice"),
                new Student(3, "asd"),
                new Student(4, "dfg"));

        List<String> names = stud.stream()
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}