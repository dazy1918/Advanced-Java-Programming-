interface i11 {
    public void calculate(int x);
}

class square implements i11 {
    public void calculate(int p) {
        int area = p * p;
        System.out.println(area);
    }
}

public class interfaceClass {
    public static void main(String[] args) {
        i11 s = new square();
        s.calculate(5);
    }
}
