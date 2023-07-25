package polymorphism;

public class SBI extends Bank{
    public void rateofinterest(){

        System.out.println("the rate of interest for SBI is 7.5%");
    }
    public static void main(String[] args) {
        SBI s=new SBI();
        s.rateofinterest();
    }
}
