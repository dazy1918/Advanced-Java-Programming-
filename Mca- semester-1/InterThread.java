class Message {
    boolean ready = false;

    synchronized void waitForSignal() {
        System.out.println("Thread A waiting...");
        while (!ready) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Thread A received signal!");
    }

    synchronized void sendSignal() {
        System.out.println("Thread B sending signal...");
        ready = true;
        notify(); // waiting thread ko jagao
    }
}

public class InterThread {
    public static void main(String[] args) {
        Message msg = new Message();

        Thread A = new Thread(() -> msg.waitForSignal());
        Thread B = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            msg.sendSignal();
        });

        A.start();
        B.start();
    }
}
