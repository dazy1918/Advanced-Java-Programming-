interface Int1 {
    String show(String s);
}

interface Int2 {
    int cal(String s);
}

public class InstanceMethod3 {
    public static void main(String[] args) {

        // 1️) Method references (original)
        Int1 i1 = String::toUpperCase;
        Int2 i2 = String::length;

        String input = "java";             //  variable: stores original string
        String upperResult = i1.show(input); //  variable: stores method result
        int lengthResult = i2.cal(input);    //  variable: stores method result

        // 2️) Print results
        System.out.println("Original String: " + input);     // variable use
        System.out.println("Uppercase: " + upperResult);     // method result stored in variable
        System.out.println("Length: " + lengthResult);       // method result stored in variable

        // 3️) Using variables only (no method)
        String Upper = "JAVA";          // variable only
        int Length = input.length();    // variable only

        System.out.println("Manual Uppercase: " + Upper);
        System.out.println("Manual Length: " + Length);
    }
}












