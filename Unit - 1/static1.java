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

//Static Method
interface inter3{
    static int add(int x, int y){
        return(x+y);
    }

}
public class static1 implements inter1,inter2,inter3{
    public void show() {
        inter1.super.show();
        inter2.super.show();
    }
public static void main(String[] args){
    static1 d= new static1();
    d.show();
    System.out.println(inter3.add(4,5));
    }
}
