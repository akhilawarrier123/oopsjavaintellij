package encap1;

public class Cardriver {
    public static void main(String[] args) {
        Car ob= new Car();
        ob.setCom_name("TATA");
        ob.setMod_name("Nexon");
        ob.setYear(2020);
        ob.getMileage();
        Car obj= new Car();

        obj.setCom_name("Suzuki");
        obj.setMod_name("Brezza");
        obj.setYear(2021);
        obj.getMileage();
        System.out.println(ob);
        System.out.println(obj);
    }
}