package threading;

public class Sumthread extends Thread{


    public void run(){
        int sum=0;

        for(int i=0;i<40;i++){

            sum=sum+i;
            System.out.println("the current thread is  S"+ Thread.currentThread().getName());

        }


        System.out.println("the Sum is   "+sum);
    }
}
