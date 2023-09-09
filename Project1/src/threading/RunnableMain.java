package threading;

public class RunnableMain {
    public static void main(String[] args) {


        RunClassOne R1 = new RunClassOne();
        RunClassTwo R2 = new RunClassTwo();
Thread t1=new Thread(R1);
Thread t2=new Thread(R2);
t1.start();
t2.start();
    }
}