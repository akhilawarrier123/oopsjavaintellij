package threading;

public class Pdt2thread extends Thread{
    int pdt;
    public void run(){
        for(int i=0;i<20;i++){
            pdt=2*i;
            System.out.println("the current thread is  "+Thread.currentThread().getName());
        }
        System.out.println("The multiples of 2 are   "+pdt);
    }

}
