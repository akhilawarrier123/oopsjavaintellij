package abstraction1;

public class circle extends Shape{
    @Override
    public void Area() {
        System.out.println("The area of circle is");
    }

    @Override
    public void perimeter() {
        System.out.println("The perimeter of circle is");
    }
    public static void main(String[] args){
        circle C=new circle();
        C.Area();
        C.perimeter();
    }
}
