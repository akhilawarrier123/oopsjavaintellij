package aggregation;

import java.sql.SQLOutput;

public class Car {
    private  String brand;

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

    private String color;
    private int wheels;
    private int seats;
    private Musicsystem MS;

    public Musicsystem getMS() {
        return MS;
    }

    public void setMS(Musicsystem MS) {
        this.MS = MS;
    }
public void printdetails(){

    System.out.println(getBrand());
    System.out.println(getColor());
    System.out.println(getWheels());
    System.out.println(getSeats());
    if (MS!=null)
    {
    System.out.println(MS.getType());
}
 else {
        System.out.println("the car don't provide music system");
    }}
    public static void main(String[] args) {
        Car C1=new Car();
        C1.setBrand("BMW");
        C1.setColor("Yellow");
        C1.setSeats(5);
        C1.setWheels(4);
        C1.printdetails();


        Car C2=new Car();
        Musicsystem M=new Musicsystem();
        M.setType("single din");
        C2.setMS(M);
        C2.setBrand("Audi");
        C2.setColor("Black");
        C2.setSeats(5);
        C2.setWheels(4);
        C2.printdetails();
    }
}
