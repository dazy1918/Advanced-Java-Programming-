interface stringjoiner{
    public String join( String x, String y );
}

public class lambda5 {
    
    public static void main(String[] args){
        stringjoiner sj = (a,b) -> a.concat(b);
        String result = sj.join("Hello, ", "World!");
        System.out.println("The joined string is: " + result);
    }

    }

