package threading;

public class RunClassTwo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("Reading the salary of employee and calculate max" + Thread.currentThread().getName());
    }
}
}
