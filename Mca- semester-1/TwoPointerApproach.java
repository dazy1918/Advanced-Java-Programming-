// Two pointer ka use kisliye karna hai? -
// Reverse karna?
// Pair sum find karna?
// Palindrome check?
// Largest & smallest?

import java.util.Arrays;

public class TwoPointerApproach {

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 2, 8, 15, 4, 9 };
        int target = 12;

        Arrays.sort(arr);

          int j = arr.length - 1;
        for(int i = 0; i< arr.length;i++)

       while (i < j) {
            
            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println("Pair found: " + arr[i] + " " + arr[j]);
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
    }
}
