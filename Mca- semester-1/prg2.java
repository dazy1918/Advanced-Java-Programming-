import java.util.Scanner;

class prg2 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int a, b;

        System.out.println("Enter two numbers:");
        a = s.nextInt();
        b = s.nextInt();

        System.out.println("Multiplication = " + (a * b));
    }
}
