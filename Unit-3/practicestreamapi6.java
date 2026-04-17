import java.util.*;
import java.util.stream.*;

class Student {
        String name;
        int attendance;

        Student(String name, int attendance) {
                this.name = name;
                this.attendance = attendance;
        }
}

public class practicestreamapi9 {
        public static void main(String[] args) {

                // Find out list of pass and fail students in given list those attendance is
                // more than 60%
                List<Student> list = List.of(
                                new Student("Aman", 60),
                                new Student("Riya", 50),
                                new Student("Rahul", 80),
                                new Student("Neha", 34));

                List<String> pass = list.stream()
                                .filter(s -> s.attendance > 60)
                                .map(s -> s.name)
                                .collect(Collectors.toList());

                List<String> fail = list.stream()
                                .filter(s -> s.attendance <= 60)
                                .map(s -> s.name)
                                .collect(Collectors.toList());

                System.out.println("Pass: " + pass);
                System.out.println("Fail: " + fail);

                // Write a java program to count how many numbers in a list are greater than 50
                // using filter() and count()
                List<Integer> l1 = List.of(23, 45, 67, 89, 54, 23);

                long count = l1.stream()
                                .filter(h -> h > 50)
                                .count();

                System.out.println("Count: " + count);

                // write a java program to create a list of integers and use stream API to
                // filter all even numbers, square them , and print the result ussinf foreach()

                List<Integer> l3 = List.of(78, 89, 70, 65, 43, 23, 14);

                l3.stream()
                                .filter(n -> n % 2 == 0)
                                .map(n -> n * n)
                                .forEach(System.out::println);

                // write a java program to filter odd numbers from a list , double each number
                // using map(),and calculate their sum using reduce()
                List<Integer> l5 = List.of(87, 67, 54, 34, 32, 12, 45, 67);

                int sum = l5.stream()
                                .filter(v -> v % 2 != 0)
                                .map(v -> v * 2)
                                .reduce(0, (a, b) -> a + b);

                System.out.println("Sum: " + sum);

                // write a java program to filter all strings with the letter'A', sort them,and
                // display only the first 3 elements
                List<String> names = List.of("Aman", "Riya", "Akash", "Ankit", "Neha");

                names.stream()
                                .filter(n -> n.startsWith("A"))
                                .sorted()
                                .limit(3)
                                .forEach(System.out::println);

                // write a java program to remove duplicate from a list , sort them in
                // descending order using sorted(comparator) , and display the result
                List<Integer> nums = List.of(10, 30, 45, 56, 10, 6, 31, 30);

                nums.stream()
                                .distinct()
                                .sorted((a, b) -> b - a)
                                .forEach(System.out::println);

                // write a java program to find the sum of squares of distinct even numbers from
                // list
                int result = nums.stream()
                                .filter(x -> x % 2 == 0)
                                .distinct()
                                .map(x -> x * x)
                                .reduce(0, Integer::sum);

                System.out.println("Sum of squares: " + result);
        }
}