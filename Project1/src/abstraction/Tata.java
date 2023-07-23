package abstraction;

public class Tata extends electriccar {
    @Override
    public void changegear() {
        System.out.println("gear is changed");
    }

    @Override
    public void inf0tainment() {
        System.out.println("infotainment system is installed");

    }

    public static void main(String[] args){
        Tata T=new Tata();
        T.changegear();
        T.inf0tainment();
    }
}
