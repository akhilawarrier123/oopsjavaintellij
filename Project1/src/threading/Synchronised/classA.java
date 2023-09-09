package threading.Synchronised;

public class classA extends Thread {
    public synchronized void sum(int a)
            throws InterruptedException {
Thread.sleep(100);
    }
}
