package encap;

public class Rectangle
{
private double Length;

    @Override
    public String toString() {
        return "Rectangle{" +
                "Length=" + Length +
                ", Width=" + Width +
                '}';
    }

    double Width;

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }
}
