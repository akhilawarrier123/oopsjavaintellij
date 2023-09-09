package threading.Synchronised;

public class MainBarber {
    public static void main(String[] args) {


        Barber B = new Barber();
        Personclass P1 = new Personclass(B, "Short");
        Personclass P2 = new Personclass(B, "Long");

        Thread T1 = new Thread(P1);
        Thread T2 = new Thread(P2);
        T1.start();
        T2.start();
    }
}