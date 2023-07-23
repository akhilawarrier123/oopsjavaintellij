package intrfaceassignment;

public class rectangle implements drawable{
    @Override
    public void draw() {
        System.out.println("the rectangle is drawn ");
    }

    public static void main(String args[]){
        rectangle r=new rectangle();
        r.draw();
    }
}

