class Test2 {
    Test2() {
        var x = 80;   // local variable in constructor
        System.out.println("Constructor value is " + x);
    }

    void check() {
        var s = "MCA";   // local variable in method
        System.out.println(s);
    }
}

public class localvariable1 {
    public static void main(String[] args) {
        Test2 t = new Test2(); 
        t.check();            
        for(var i=0; i<=4; i++){    //Inside a block
            System.out.println(i);
        }
    }
}
