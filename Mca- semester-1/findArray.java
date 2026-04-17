public class findArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 56, 89, 34, 21 };
        int target = 34;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                int result = target;
                System.out.println("Target is Present" + result);
            } else {
                System.out.println("Target not present");
            }
        }
    }
}
