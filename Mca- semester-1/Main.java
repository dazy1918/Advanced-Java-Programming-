class thread4 implements Runnable {
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String args[]) {

        thread4 t[] = new thread4[5];
        Thread th[] = new Thread[5];

        for (int i = 0; i < 5; i++) {
            t[i] = new thread4();      
            th[i] = new Thread(t[i]);  
            th[i].start();             
        }
    }
}