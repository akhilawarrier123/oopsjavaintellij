package problems.Sample_prgms;

import java.sql.SQLOutput;

public class Swap_number {
    public static void main(String[] args) {


        int a = 9;
        int b = 4;
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println(a);
        System.out.println(b);
        System.out.println("The nos after swaping is: "+a + b);

    }
}