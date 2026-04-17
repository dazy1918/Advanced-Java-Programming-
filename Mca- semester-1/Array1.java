public class Array1 {
    public static void main(String[] args) {
        int[] num = { 10, 20, 30, 40, 50 };
        int targetNum = 50;
        boolean found = false;

        for (int n : num) {
            if (n == targetNum) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(targetNum + " is present in the array.");
        } else {
            System.out.println(targetNum + " is not present in the array.");
        }
    }
}
