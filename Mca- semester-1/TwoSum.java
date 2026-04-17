import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] print = new int[5];

        // Input array elements
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < print.length; i++) {
            print[i] = sc.nextInt();
        }

        // Print array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < print.length; i++) {
            System.out.println("print[" + i + "] = " + print[i]);
        }

        // Input target number
        System.out.print("Enter target number: ");
        int target = sc.nextInt();

        // Find two numbers whose sum equals target
        boolean found = false;
        for (int i = 0; i < print.length; i++) {
            for (int j = i + 1; j < print.length; j++) {
                if (print[i] + print[j] == target) {
                    // Print indices in array-style format
                    System.out.println("[" + i + ", " + j + "]");
                    found = true;
                    break; // stop after finding the first pair
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No two numbers add up to the target.");
        }

        sc.close();
    }
}
