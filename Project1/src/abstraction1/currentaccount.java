package abstraction1;

public class currentaccount extends bankacccount{
    @Override
    public void deposit() {
        System.out.println("the money deposited is:");
    }

    @Override
    public void withdraw() {
        System.out.println("the money withdrawn is:");
    }
    public static void main(String args[]){
        currentaccount ca=new currentaccount();
        ca.deposit();
        ca.withdraw();
    }
}
