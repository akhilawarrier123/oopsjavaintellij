package abstraction1;

public class savingsaccount extends bankacccount{
    @Override
    public void deposit() {
        System.out.println("the money deposited is:");
    }

    @Override
    public void withdraw() {
        System.out.println("the money withdrawn is:");
    }
    public static void main(String args[]) {
        savingsaccount sa = new savingsaccount();
        sa.deposit();
        sa.withdraw();
    }
}
