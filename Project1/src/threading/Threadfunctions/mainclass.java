package threading.Threadfunctions;

public class mainclass {
    public static void main(String[] args) {


        Painting painting = new Painting();


        Friendone f1 = new Friendone(painting);
        Friendtwo f2 = new Friendtwo(painting);

        Thread T1=new Thread(f1);
        Thread T2=new Thread(f2);
        T1.start();
        T2.start();

    }
}