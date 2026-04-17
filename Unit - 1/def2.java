interface inter1{
    default void show(){
        System.out.println("default method inside interface1");
    }
}

interface inter2{
    default void show(){
        System.out.println("default method inside interface2");
    }
}
public class def2 implements inter1,inter2{
    public void show() {
        inter1.super.show();
        inter2.super.show();
    }
public static void main(String[] args){
    def2 d= new def2();
    d.show();
    
    }
}


