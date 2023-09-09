package problems.Sample_prgms;

import java.sql.SQLOutput;
import java.util.Scanner;

//Perfect Number: a positive integer that is equal to the sum of its proper divisors.
public class perfectnumber {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n=in.nextInt();

        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;  //similar to sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("number is perfect");
        }
        else{
            System.out.println("number not perfect");
        }
    }
}