//write a java program using a lamda expression to print all element uppercase using foreach()

interface isgreater {
    boolean check(int a, int b);
}

class lambda7 {
    public static void main(String[] args) {
        isgreater ig = (a, b) -> a > b;
        int num1 = 70;
        int num2 = 20;
        if (ig.check(num1, num2)) {
            System.out.println(num1 + " is greater ");
        } else {
            System.out.println(num1 + " is not greater ");
        }
    }
}