package threading.Synchronised;

public class printer {
//Synchronized keyword establish communication between threads that is after one thread  excecution only next one is excecuted
    public synchronized void printDocument(String document){
        System.out.println(document+"Printing");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);


        }
        System.out.println(document+"Print finished");
    }
}
