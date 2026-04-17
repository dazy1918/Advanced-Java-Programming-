@FunctionalInterface
interface MathOperation {
    public int operation(int x);
}

public class lambda3 {
    public static void main(String[] args) {

    //with one parameter
   MathOperation m=(a)->a*a;
    System.out.println("square="+m.operation(25));
         
    }
}
