package threading;

public class main {
    public static void main(String[] args) {
        Mythread1 M1=new Mythread1();
        Mythread2 M2=new Mythread2();
        M1.start();
        M2.start();
    }
}
