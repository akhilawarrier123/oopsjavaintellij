package threading.Synchronized1;

public class PhoneBooth {
    public synchronized void calling(int num){
        System.out.println(num+"   Printing the number function");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);


        }
        System.out.println(num+"   Print finished");
    }
}
