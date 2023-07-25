package polymorphism;

public class AXIS extends Bank{
    public void rateofinterest(){

        System.out.println("the rate of interest for SBI is 9.4%");
    }
    public static void main(String[] args) {
        AXIS A=new AXIS();
        A.rateofinterest();
    }
}
