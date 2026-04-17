import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class practicestreamapi8 {
    public static void main(String[] args) {

        // Write a java program to extract the names of all students from a list of
        // student objects using map()

        List<Student> list = List.of(
                new Student("riya"),
                new Student("kavi"),
                new Student("kiya"),
                new Student("jiya"));

        List<String> names = list.stream()
                .map(x -> x.name)
                .collect(Collectors.toList());

        System.out.println(names);

        // write a java program to filter numbers greater than 50 from a list of
        // integers and store them in a new list

        List<Integer> l4 = List.of(45, 78, 65, 23, 43, 12, 34);
        List<Integer> l5 = l4.stream()
                .filter(x -> x > 50)
                .collect(Collectors.toList());
        System.out.println(l5);

        // write a java program to filter positive numbers greater than 20

        List<Integer> l6input = List.of(67, 32, 23, 12, 32, 54, 25, 17);
        List<Integer> l6 = l6input.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());
        System.out.println(l6);

        // write a java program to filter all strings that end with the letter 'A' from
        // a list of string

        List<String> s1 = List.of("Aarohi", "Arayan", "bhumi", "ritu");
        List<String> str1 = s1.stream()
                .filter(n1 -> n1.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(str1);

        // write a java program to filter all strings that end with the letter 'A' from
        // a list of string

        List<String> s2 = List.of("rahul", "eeshu", "aarodhya");
        List<String> str2 = s2.stream()
                .filter(m1 -> m1.endsWith("a"))
                .collect(Collectors.toList());
        System.out.println(str2);

        // write a java program to filter positive numbers from a list of integers

        List<Integer> l8 = List.of(78, -67, -54, 90, 32, -23);
        List<Integer> l9 = l8.stream()
                .filter(m5 -> m5 > 0)
                .collect(Collectors.toList());
        System.out.println(l9);

        // write a java program to filter odd numbers from a list of integers

        List<Integer> l10 = List.of(88, 67, 94, 90, 32, 23, 76);
        List<Integer> l11 = l10.stream()
                .filter(m5 -> m5 % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(l11);

        // write a java program to filter all strings containing 'A' from a list of
        // strings

        List<String> str4 = List.of("yashi", "mahi", "kiyo", "taru");
        List<String> str5 = str4.stream()
                .filter(f -> f.contains("a"))
                .collect(Collectors.toList());
        System.out.println(str5);

        // write a java program to filter all strings whose length grater than 5 from a
        // list of strings
        // write a java program to filter numbers divisible by 3 from a list of integers
        // write a java program using map() to convert a list of lowercase strings into
        // uppercase strings
        // Add 10 to each element of a list map()
        // Find the length of each string in alist using map()
        // Extract the first character from eac string using map()
        // From a list of integers , convert each number into its square
        // Given a list of integers , create a new list where each element is double
        // Write a java program to replace all negative numbers with 0 and find thhe sum
        // using reduce()
        List<Integer> l1 = List.of(10, -5, 20, -3, 15);

        int SumReplaceNegativeNum = l1.stream()
                .map(p1 -> p1 < 0 ? 0 : p1)
                .reduce(0, (p1, p2) -> p1 + p2);

        System.out.println(SumReplaceNegativeNum);
    }
}