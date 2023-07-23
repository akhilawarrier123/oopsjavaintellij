package intrfaceassignment;

public class triangle implements drawable{
    @Override
    public void draw() {
        System.out.println("the triangle is drawn ");
    }


    public static void main(String args[]){
        triangle t=new triangle();
        t.draw();
    }
}
