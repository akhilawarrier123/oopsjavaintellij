package threading.Threadfunctions.thread1;

public class mainhotel {
    public static void main(String[] args) {


        Hotel H = new Hotel();
        Customer C = new Customer(H);
        Waiter W = new Waiter(H);

        Thread T1 = new Thread(W);
        Thread T2 = new Thread(C);
        T1.start();
        T2.start();
    }
}