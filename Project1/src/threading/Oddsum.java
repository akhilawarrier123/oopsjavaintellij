package threading;

public class Oddsum implements Runnable{
    @Override
    public void run() {
        int Oddsum=0;
        for(int i=0;i<=40;i++){

            if(i%2!=0){
                Oddsum=Oddsum+i;
            }
            System.out.println("The current thread is "+Thread.currentThread().getName());
        }
        System.out.println("The Odd sum is:  "+Oddsum);
    }
}
