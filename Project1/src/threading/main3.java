package threading;

public class main3 {
    public static void main(String[] args) {
        Avg1 A=new Avg1();
        Evensum E=new Evensum();
        Oddsum O=new Oddsum();
        Thread t1=new Thread(A);
        Thread t2=new Thread(E);
        Thread t3=new Thread(O);
        t1.start();
        t2.start();
        t3.start();
    }
}
