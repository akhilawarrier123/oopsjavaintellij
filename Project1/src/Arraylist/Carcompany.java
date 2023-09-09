package Arraylist;

import java.util.ArrayList;

public class Carcompany {

    static ArrayList<Car1> arrayListCar = new ArrayList<Car1>();

    public static void main(String[] args) {


        Car1 C1 = new Car1();
        C1.setBrand("Tata");
        C1.setColor("Green");
        C1.setSeats(7);
        C1.setWheels(4);

        Car1 C2 = new Car1();
        C2.setBrand("Zuzuki");
        C2.setColor("Yellow");
        C2.setSeats(5);
        C2.setWheels(4);

        Car1 C3 = new Car1();
        C3.setBrand("Hyundai");
        C3.setColor("Red");
        C3.setSeats(5);
        C3.setWheels(4);

        Carlists.Carlist.add(C1);
        Carlists.Carlist.add(C2);
        Carlists.Carlist.add(C3);
        for (int i = 0; i < arrayListCar.size(); i++) {

            System.out.println(arrayListCar.get(0).getBrand());
            System.out.println(arrayListCar.get(1).getWheels());
            System.out.println(arrayListCar.get(2).getSeats());
            System.out.println(arrayListCar.get(2).getColor());
        }

    }
}