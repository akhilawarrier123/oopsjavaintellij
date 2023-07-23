package interface1;

public class spacecraft implements flyable {
    @Override
    public void fly_obj() {
        System.out.println("the air transportation modes");
    }

    public static void main(String args[]) {
        spacecraft sp = new spacecraft();
        sp.fly_obj();
    }
}