package abstraction1;

public class lions extends animals{
    @Override
    public void sleep() {
        System.out.println(" sleeping sound kurrr......");
    }


    @Override
    public void eat() {
        System.out.println(" eating sound chusssk......");
    }
    public static void main(String[] args){
        lions l1=new lions();
        l1.eat();
        l1.sleep();
    }
}
