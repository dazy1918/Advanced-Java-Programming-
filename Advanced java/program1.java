//Create a interface MathUtil with static methods and use method references to :
// * add number
// * find maximum
// *check even/odd


@FunctionalInterface
interface Add {
    int add(int a, int b);
}

interface Max {
    int max(int a, int b);
}

interface EvenOdd {
    boolean Even(int x);
}

interface MathUtil {

    static int add(int a, int b) {
        return a + b;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static boolean Even(int x) {
        return x % 2 == 0;
    }
}

public class practice7 {
    public static void main(String[] args) {

        Add a = MathUtil::add;
        System.out.println(a.add(10, 20));

        Max m = MathUtil::max;
        System.out.println(m.max(10, 20));

        EvenOdd e = MathUtil::Even;
        System.out.println(e.Even(15));
    }
}
