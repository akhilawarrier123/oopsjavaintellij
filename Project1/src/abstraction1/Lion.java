package abstraction1;

public class Lion extends animal {

    @Override
    public void sound() {
        System.out.println("The lion roars");
    }

    public static void main(String args[]){
        Lion L=new Lion();
        L.sound();
    }
}



