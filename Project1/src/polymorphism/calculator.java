package polymorphism;
//overloading concept
public class calculator {
    public double add(double a, double b) {
        double sum = a + b;
        return sum;

    }

    public long add(long a, long b) {
        long sum = a + b;
        return sum;
    }
    public int qt(int a, int b) {
        int q = a / b;
        return q;
    }
    public double qt(double a, double b) {
        double q = a / b;
        return q;
    }
    public int pt (int a, int b) {
        int p = a *b;
        return p;}
    public int pt (int a, int b,int c) {
        int p = a *b*c;
        return p;}


    public static void main(String args[]){


        calculator c1=new calculator();
       long a= c1.add(234,567);
       double b= c1.add(9.8,3.4);
        int c=c1.pt(2,3);
       int d= c1.qt(8,4);
       double e=c1.qt(2.3,4.5);
        int f= c1.pt(2,4,7);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);



    }}