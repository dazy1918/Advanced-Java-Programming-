class MyThread extends Thread{
    public void run(){
        System.out.println("Sum of first 100 natural number");
        calculate(100);
        
    }
    
    public  void calculate(int num){
        int sum=(num*(num+1))/2;
        System.out.println("The sum is:"+sum);
        
    }
    
}
public class thread {
    public static void main(String[] args) {
        MyThread th=new MyThread();
        th.start();
    }    
}