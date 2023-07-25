package poly;

public class NormalAccount {

    protected float balance;

    public void deposit(float amt){
        balance = balance + amt;
        System.out.println("Your current balance  after deposit is "+ balance);
    }

    public void withdraw(float amt){
        balance = balance - amt;
        System.out.println("Your current balance after withdraw"+ balance);
    }
}
