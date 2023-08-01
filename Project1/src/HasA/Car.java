package HasA;

import java.sql.SQLOutput;
// EG OF COMPOSITION WITHOUT ENGINE CAR CANNOT WORK SO ENGINE AND CAR IS DEPENDENT EACH OTHER.
public class Car {
  private  String brand;
  private String color;
  private int wheels;
  private int seats;
  private Engine engine;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
public void printdetails(){
    System.out.println(getBrand());
    System.out.println(getColor());
    System.out.println(getSeats());
    System.out.println(getWheels());
    System.out.println(engine.getEngine_type());
    System.out.println(engine.getHorsePower());


}
    public static void main(String[] args) {
        Car C1=new Car();
        C1.setBrand("Tesla");
        C1.setColor("Red");
        C1.setSeats(4);
        C1.setWheels(4);

        Engine E1=new Engine();
        E1.setEngine_type("Hybrid");
        E1.setHorsePower(740);
        //C1.getEngine();
        C1.setEngine(E1);
        C1.printdetails();
    }
}
