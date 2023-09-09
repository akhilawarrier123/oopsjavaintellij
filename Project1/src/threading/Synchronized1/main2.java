package threading.Synchronized1;

public class main2 {
    public static void main(String[] args) {
        PhoneBooth P=new PhoneBooth();
        user1 U1=new user1(P,892);
        user1 U2=new user1(P,906);
        Thread T1=new Thread(U1);
        Thread T2=new Thread(U2);
        T1.start();
        T2.start();
    }
}
