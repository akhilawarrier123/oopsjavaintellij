package polymorphism;

import java.sql.SQLOutput;

public class XYZaccount extends Normalaccount{
    public void deposit() {


        if(damount>15000)
        {
            samount = samount+(damount-100);
            mfbalance=mfbalance+100;}
        else
        {
            samount = samount + damount;
        }
        System.out.println("the samount and mfbalance is");
    }
    public void withdraw(){
       double balance=samount-wamount-100.00;
        System.out.println(" rs 10 is deducted for every transaction");
    }


    public static void main(String[] args) {
        Normalaccount N=new  Normalaccount();
        N.damount=16000;
        N.samount=50000;
        N.mfbalance=20000;
        N.getDamount();
        N.getSamount();
        N.getBalance();
        N.getMfbalance();
        N.getWamount();
        System.out.println(N.getDamount());
        System.out.println( N.getSamount());
        System.out.println(N.getBalance());
        System.out.println(N.getMfbalance());
        System.out.println( N.getWamount());

    }
    }
