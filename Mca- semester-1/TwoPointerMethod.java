// With Duplicate

import java.util.Arrays;

public class TwoPointerMethod {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 2, 8, 15, 4, 9 };
        int target = 12;

        Arrays.sort(arr);

        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++)

            // if(arr[i]==arr[i+1]){

            // }

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
