package poly;

public class ABCAccount extends NormalAccount{
    float mutualFundBalance;

    public void deposit(float amt){
        if(amt>15000) {
            float percentage = 0.2f * amt;
            amt =  amt - percentage;
            balance = balance + amt;
            mutualFundBalance = mutualFundBalance + percentage;
        }else{
            balance = balance + amt;
        }
        System.out.println("Your balance  after deposit is "+ balance);
        System.out.println("Your mf  "+ mutualFundBalance);
    }

    public void withdraw(float amt){
        balance = balance - amt;
        amt = amt - (0.5f * amt)/100;
        System.out.println(" 10 rs is deducted as a transaction fee");
        System.out.println("The current balance after withdrawal "+ balance);
        System.out.println("The recieved amount  "+ amt);
    }


    public void setMutualFundBalance(float mutualFundBalance) {
        this.mutualFundBalance = mutualFundBalance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        ABCAccount abcAccount = new ABCAccount();
        abcAccount.setBalance(50000);
        abcAccount.setMutualFundBalance(1000);
        abcAccount.deposit(16000);
        abcAccount.withdraw(6000);
    }
}
