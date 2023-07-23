package encap;

public class BankAccount
{
    public int getAc_no() {
        return ac_no;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "ac_no=" + ac_no +
                ", balance=" + balance +
                '}';
    }

    public void setAc_no(int ac_no) {
        this.ac_no = ac_no;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

   private int ac_no;
private double balance;

}


