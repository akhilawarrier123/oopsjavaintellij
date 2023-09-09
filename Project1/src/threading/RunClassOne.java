package threading;

public class RunClassOne implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("playing my favorate music" + Thread.currentThread().getName());
        }
    }

}
