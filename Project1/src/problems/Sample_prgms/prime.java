package problems.Sample_prgms;

public class prime {

    public int checkprime(int a){


        if(a%2!=0&&a!=2){
            System.out.println("Prime Number");

        }

        else {
            System.out.println("Composite Number");}
      return 0;
    }

    public static void main(String[] args) {
        int a=11;
        prime P=new prime();
        P.checkprime(11);
        System.out.println( P.checkprime(11));
    }
}
