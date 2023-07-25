package poly;

public class XYZAccount extends NormalAccount{
    float mutualFundBalance;

    public void deposit(float amt){
        if(amt>15000) {
            amt = amt - 100;
            balance = balance + amt;
            mutualFundBalance = mutualFundBalance + 100;
        }else{
            balance = balance + amt;
        }
        System.out.println("Your balance  after deposit is "+ balance);
        System.out.println("Your mf  "+ mutualFundBalance);
    }

    public void withdraw(float amt){
        balance = balance - amt;
        amt = amt - 10;
        System.out.println("10 rs is deducted as a transaction fee");
        System.out.println("The current balance after withdrawal "+ balance);
        System.out.println("The recieved amount "+ amt);
    }

    public void setMutualFundBalance(float mutualFundBanlace) {
        this.mutualFundBalance = mutualFundBalance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        XYZAccount xyzAccount = new XYZAccount();
        xyzAccount.setBalance(50000);
        xyzAccount.setMutualFundBalance(1000);
        xyzAccount.deposit(16000);
        xyzAccount.withdraw(6000);
    }
}
