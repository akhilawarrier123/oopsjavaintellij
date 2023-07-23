package interface1;

public class aeroplane implements flyable {
    @Override
    public void fly_obj() {

    }

    public static void main(String args[]) {
        aeroplane a = new aeroplane();
        a.fly_obj();
        spacecraft sp = new spacecraft();
        sp.fly_obj();
    }
}