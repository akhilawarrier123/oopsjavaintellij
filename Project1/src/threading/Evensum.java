package threading;

public class Evensum implements Runnable{
    @Override
    public void run() {

        int sumeven=0;
        for(int i=0;i<=40;i++){
            if(i%2==0){

                sumeven=sumeven+i;

            }
            System.out.println("The current thread is "+Thread.currentThread().getName());
        }

        System.out.println("The Even sumis:   "+ sumeven);
    }
}
