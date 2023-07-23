package encap1;

public class Circledriver {
int radius;
    public void area(int radius){
        double   area=(3.14*radius*radius);
    System.out.println(  "The area of given circle is    "+area);}
    public void perimeter(int radius) {
        double perimeter=2*3.14*radius;
        System.out.println("The area of given circle is    "+perimeter);
    }
    public static void main(String[] args) {

      Circle c1=new Circle();
      Circledriver C=new Circledriver();
C.radius=10;

      c1.setRadius(10);
      c1.getRadius();

        C.area(10);
        C.perimeter(10);
      System.out.println(c1);
       // System.out.println(C.area());

    }
    }

