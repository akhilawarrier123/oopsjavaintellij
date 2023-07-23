package abstraction;

public class dog extends Animal{
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }


    public static void main(String[]args){
        dog d=new dog();
        d.sleeps();
        d.walks();
        d.sound();
    }
}
