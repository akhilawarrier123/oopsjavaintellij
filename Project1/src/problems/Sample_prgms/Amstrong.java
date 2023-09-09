package problems.Sample_prgms;




import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        int number,num,temp,total=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int n=in.nextInt();
        num=n;
        while(num!=0)
        {
            temp=num%10;
            total=total+temp*temp*temp;
            num/=10;
        }
        if(total == n)
            System.out.println(n+ " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");

    }
}
