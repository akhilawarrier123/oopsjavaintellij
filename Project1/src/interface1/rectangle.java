package interface1;

public class rectangle implements resizable {

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void resizewidth(int width) {
    }

    @Override
    public void resizeheight(int height) {

    }

    public void  area() {
        double area = width * height;
        System.out.println(" the area of given rectangle is   " +area);
    }

    public static void main(String args[]){
        rectangle r=new rectangle();
        r.setWidth(6);
        r.setHeight(8);
       r.getWidth();
        r.getWidth();
        r.resizewidth(6);
        r.resizeheight(8);
        r.area();
    }
}