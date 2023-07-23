package abstraction;
//concrete class means all the methods are implemented
public  class petrolcar extends Car{

    @Override
    public void changegear() {
        System.out.println(" the gear is changed ");

    }

    @Override
    public void inf0tainment() {
        System.out.println("infotainment is installed");
    }
    public static void main(String[] args) {

        petrolcar car = new petrolcar();
        car.setCar("Honda");
        car.inf0tainment();
        car.start();
        car.stop();
        System.out.println(car.getCar());

    }
}
