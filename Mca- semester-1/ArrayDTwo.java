public class ArrayDTwo {
    public static void main(String[] args) {
        int arr1[][] = new int[2][2];

        arr1[0][0] = 12;
        arr1[0][1] = 10;
        arr1[1][0] = 21;
        arr1[1][1] = 18;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

