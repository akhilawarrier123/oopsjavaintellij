package abstraction1;

public class tigers extends animals {
    @Override
    public void sleep() {
        System.out.println(" sleeping sound rrrrr......");
    }

    @Override
    public void eat() {
        System.out.println("eating sound chukkkkkkk......");
    }
    public static void main(String[] args){
        tigers T1=new tigers();
        T1.eat();
        T1.sleep();

    }}
