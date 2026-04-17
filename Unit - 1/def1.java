interface inter1{
    default void def1(){
        System.out.println("default method inside interface");
    }
}
public class def1 implements inter1{
public static void main(String[] args){
    def1 d= new def1();
    d.def1();

    }
}
