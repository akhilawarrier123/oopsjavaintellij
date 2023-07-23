package PACK1;

public class circle extends shape {
    double radius;


    public void area(double r) {
        radius = r;
        double area = 3.14 * radius * radius;
        System.out.println(area);

    }

    public static void main(String[] args) {


        circle x = new circle();
        x.color = "green";
        x.color();
        x.area(7.8);

        circle x1 = new circle();
        x1.color = "green";
        x1.color();
        x1.area(7.8);


    }





    }