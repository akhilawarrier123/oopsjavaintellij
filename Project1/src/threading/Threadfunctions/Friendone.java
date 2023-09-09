package threading.Threadfunctions;

public class Friendone implements Runnable{



    Painting painting;

    public Friendone(Painting painting) {
        this.painting = painting;
    }
    @Override
    public void run() {
        painting.drawoutline();

    }
}
