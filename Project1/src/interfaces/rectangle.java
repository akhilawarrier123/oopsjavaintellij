package interfaces;

public class rectangle implements shape{
    @Override
    public void getArea() {
        int l=4; int b=2;
        double area=(l*b);
        System.out.println(area);
    }
    public static void main(String args[]){
        int i =0;
        rectangle r=new rectangle();

        r.getArea();


    }
}
