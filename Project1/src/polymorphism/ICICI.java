package polymorphism;

public class ICICI extends Bank{
    public void rateofinterest(){

        System.out.println("the rate of interest for ICICI is 8.4%");
    }
    public static void main(String[] args) {
        ICICI I=new ICICI();
        I.rateofinterest();
    }
}
