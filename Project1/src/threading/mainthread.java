package threading;

public class mainthread {
    public static void main(String[] args) {
        Sumthread S1=new Sumthread();
        Pdt2thread P1=new  Pdt2thread();
        S1.start();
        P1.start();

    }
}
