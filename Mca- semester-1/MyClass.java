import java.util.Scanner ;
class MyClass{
    public static void main(String[] args){
        int x, y, sum;
        Scanner myObj = new Scanner(System.in);
        x= myObj.nextInt();
        y= myObj.nextInt();
        sum=x+y;
        System.out.println("sum :" +sum);
    }
}