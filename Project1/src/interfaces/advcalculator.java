package interfaces;

public abstract class advcalculator implements calculator{
    @Override
    public void sum(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void sub(int a, int b) {
        System.out.println(a-b);
    }

    @Override
    public void pdt(int a, int b) {
        System.out.println(a*b);
    }

    @Override
    public void div(int a, int b) {
        System.out.println(a/b);
    }

        public abstract void rem(int a,int b);


}
