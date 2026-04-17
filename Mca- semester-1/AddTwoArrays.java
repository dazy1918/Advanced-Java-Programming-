import java.util.Scanner;

public class AddTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for the size of the arrays
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        // Step 2: Create three arrays
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] sum = new int[size];

        // Step 3: Input elements for the first array
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        // Step 4: Input elements for the second array
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }

        // Step 5: Add both arrays element by element
        for (int i = 0; i < size; i++) {
            sum[i] = arr1[i] + arr2[i];
        }

        // Step 6: Display the result
        System.out.println("Resultant (Sum) Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(sum[i] + " ");
        }

        sc.close();
    }
}
