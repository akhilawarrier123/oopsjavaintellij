package basics;

public class advcalculator extends calculator{

    public static void sub(double a, double b) {
        double diff = a - b; //17-11
        System.out.println("the difference is "+ diff);
    }
    public static void add(int a, int b,int c) {
        int sum = a + b+c; //17-11
        System.out.println("the sum is "+ sum);
    }
    public static void mul(int a, int b,int c) {
        int pdt = a * b*c; //17-11
        System.out.println("the pdt is "+ pdt);
    }
    public static void div(long a, long b) {
        long quo = a / b; //17-11
        System.out.println("the quotient is "+ quo);
    }

    public static void main(String[] args) {
        advcalculator.sub(2.5,1.5);

        advcalculator.div(234,2);
        advcalculator.mul(2,4,6);
        advcalculator.add(5,69,45);
        advcalculator.mul(2,3);
        advcalculator.div(10,5);
        advcalculator.add(5,6);
        advcalculator.sub(9,3);


    }
}
