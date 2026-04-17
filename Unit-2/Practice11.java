//Write a java Program to filter employees whoose salary is greater than 60,000 
//and return their names in upper in uppercase using map()

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Practice11 {
    public static void main(String[] args) {

        List<Employee> emp = Arrays.asList(
                new Employee(1, "xyz", 50000),
                new Employee(2, "alice", 70000),
                new Employee(3, "asd", 65000),
                new Employee(4, "dfg", 40000));

        List<String> names = emp.stream()
                .filter(e -> e.salary > 60000)
                .map(e -> e.name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(names);
    }
}