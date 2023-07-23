package encap;

public class BankAccountdriver {
    public static void main(String[] args){

        BankAccount B1=new BankAccount();
        BankAccount B2=new BankAccount();
        B1.setAc_no(0001234567);
        B1.setBalance(15000);
        B2.setAc_no(0000156032);
        B2.setBalance(180000);
        System.out.println(B1);
        System.out.println(B2);
    }

}
