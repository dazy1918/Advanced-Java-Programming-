class thred2 extends Thread{
	
	thred2(String name){
		super(name);
}

 public void run(){

//  System.out.println("thread 1 is runining");
  System.out.println(Thread.currentThread().getName()+"is runining");
}

}
public class CurrentThreadClass{
   
   public static void main(String[] args){
   System.out.println(Thread.currentThread().getName() +"is runining");
   thred2 t1=new thred2("aa");
   thred2 t2=new thred2("bb");
   
   t1.start();
   t1.setName("Dazy ");
   t2.start();
}
  
}