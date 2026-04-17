import java.util.Scanner;

public class CalculateSumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];   
        int sum = 0;             

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];   
        }

  
        System.out.println("Sum of array elements = " + sum);

        sc.close();
    }
}
