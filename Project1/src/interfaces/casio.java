package interfaces;

public class casio extends advcalculator{
    @Override
    public void rem(int a, int b) {
        System.out.println(a%b);
    }
    public static void main(String args[]){
        casio c=new casio();
        c.rem(8,7);
        c.div(8,7);
        c.pdt(8,7);

    }
}
