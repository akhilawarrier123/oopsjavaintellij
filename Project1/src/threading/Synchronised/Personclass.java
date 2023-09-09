package threading.Synchronised;

public class Personclass implements Runnable {
    Barber barber;
    String type;

    public Personclass(Barber barber, String type) {
        this.barber = barber;
        this.type = type;
    }

    @Override
    public void run() {barber.TypeofHaircut(type);
    }
}
