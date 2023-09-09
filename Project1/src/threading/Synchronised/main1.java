package threading.Synchronised;

public class main1 {
    public static void main(String[] args) {


        printer P = new printer();
        User user1 = new User(P, "doc_1");
        User user2 = new User(P, "doc_2");

        Thread T1 = new Thread(user1);
        Thread T2 = new Thread(user2);
        T1.start();
        T2.start();
    }
}
