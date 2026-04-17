import java.util.*;

public class Array11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int print[] = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < print.length; i++) {
            print[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < print.length; i++) {
            System.out.println("print[" + i + "] = " + print[i]);
        }
    }
}
