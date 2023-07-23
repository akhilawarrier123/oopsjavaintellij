package encap1;

public class Circle {
    public float getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    private float radius;


        }


