interface Maximum{
     public int number(int x , int y);
}

public class lambda4 {
    
 public static void main(String[] args) {

    Maximum m = (a, b) -> (a > b) ? a : b;
    //condition ? value_if_true : value_if_false;


        System.out.println("Maximum = " + m.number(10, 20));
    }
}

