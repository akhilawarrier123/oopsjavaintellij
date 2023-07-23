package interfaces;

public class triangle implements shape{
    @Override
    public void getArea() {
        int l=6;int b=3;
        double area=0.5*l*b;
        System.out.println("The area is"+area);
    }

    public static void main(String args[]) {

        triangle t = new triangle();

        t.getArea();
    }
}
