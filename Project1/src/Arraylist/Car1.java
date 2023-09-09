package Arraylist;

public class Car1 {
    private  String brand;
    private String color;
    private int wheels;
    private int seats;

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

    public void printdetails(){
        System.out.println(getBrand());
        System.out.println(getColor());
        System.out.println(getSeats());
        System.out.println(getWheels());
    }
}
