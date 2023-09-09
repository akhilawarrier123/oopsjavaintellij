package threading.Synchronised;

public class Barber {
    public synchronized void TypeofHaircut(String type){
        System.out.println(type+"   cutting");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(type+"   cutting finished");
    }
    }

