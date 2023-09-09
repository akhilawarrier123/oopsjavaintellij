package threading.Threadfunctions;

public class Friendtwo implements Runnable {
    Painting painting;

    public Friendtwo(Painting painting) {
        this.painting = painting;
    }
    @Override
    public void run() {
        painting.fillcolor();

    }
}
