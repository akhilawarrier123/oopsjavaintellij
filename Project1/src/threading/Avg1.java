package threading;

public class Avg1 implements Runnable{
    @Override
    public void run() {
        double avg=0;
        int sum=0;
        int n=30;
        for(int i=0;i<=n;i++){
            sum=sum+i;
            System.out.println("The current thread is "+Thread.currentThread().getName());

        }
        avg=sum/n;

        System.out.println("The avg is:    "+avg);
    }
}
