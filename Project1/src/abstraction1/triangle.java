package abstraction1;

public class triangle extends Shape{
    @Override
    public void Area() {
        System.out.println("The area of triangle is");
    }

    @Override
    public void perimeter() {
        System.out.println("The area of triangle is");
    }
    public static void main(String args[]){
        triangle t=new triangle();
        t.Area();
        t.perimeter();
    }
}
