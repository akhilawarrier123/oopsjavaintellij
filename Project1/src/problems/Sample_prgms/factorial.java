package problems.Sample_prgms;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number :  ");
        int f=1;
        int n=in.nextInt();

        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("the factorial is: "+f);
    }
}
