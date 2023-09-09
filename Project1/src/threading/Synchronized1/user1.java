package threading.Synchronized1;

public class user1 implements Runnable{


    PhoneBooth PB;
    int num;

    public user1(PhoneBooth PB, int num) {
        this.PB = PB;
        this.num = num;
    }

    @Override
    public void run() {
        PB.calling(num);
        }
    }

