package intrfaceassignment;

public class circle implements drawable {
    @Override
    public void draw() {
        System.out.println("the circle is drawn ");
    }

    public static void main(String args[]){
        circle c=new circle();
        c.draw();
    }
}
