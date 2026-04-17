//Is positive and returns true if the integer is positive(greater than zero),and false otherwise

interface Int1 {
    boolean number(int a);
}

public class InstanceMethod4 {
    public static void main(String[] args) {

     
        Int1 e = (a) -> a > 0;

        System.out.println("Is positive = " + e.number(8));
        System.out.println("Is positive = " + e.number(-4));
    }
}
