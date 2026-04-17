import java.util.*;

public class Array111 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the elements of array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        // Search a Value

        int SearchValue = 4;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == SearchValue) {

                System.out.println("Search Value : " + SearchValue + " found at index [" + i + "]");

            }
        }
        sc.close();
    }
}
