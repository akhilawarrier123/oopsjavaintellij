package abstraction1;

public class deer extends animals {
    @Override
    public void sleep() {
        System.out.println("sleeping sound zzzzzzzzzz......");
    }

    @Override
    public void eat() {

        System.out.println("eating sound hukkkkkkk......");
    }
    public static void main(String args[]){
        deer d=new deer();
        d.sleep();
        d.eat();
}}
