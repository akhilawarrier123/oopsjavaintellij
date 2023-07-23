package interface1;

public class circle implements resizable{
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void resizewidth(int width) {

    }

    @Override
    public void resizeheight(int height) {

    }
    public void area(){
        double area=3.14*radius*radius;
        System.out.println(" the area of given circle is   " +area);
    }

    public static void main(String args[]){
        circle c=new circle();
        c.setRadius(4);
        c.getRadius();
        c.area();
    }
}
