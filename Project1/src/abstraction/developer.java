package abstraction;

public class developer extends employee{
    @Override
    public void status() {
        System.out.println("promoted");
    }
    public static void main(String args[]){
        developer d1=new developer();
        d1.age();
        d1.status();
        d1.name();
    }
}
