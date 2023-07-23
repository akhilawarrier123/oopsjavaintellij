package interfaces;

public class circle implements shape {

    @Override
    public void getArea() {
        int r = 2;
        double area = 3.14 * 2 * 2;
        System.out.println("The area is"+area);
    }

    public static void main(String args[]) {

        circle r = new circle();

        r.getArea();
    }
}