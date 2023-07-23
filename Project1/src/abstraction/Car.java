package abstraction;
//common functionality
//unimplemented methods-not aware of implementation
//cannot create object of abstract class
//if we have abstract method in given class it is mandatory to declare that class as abstract.
public abstract class Car {
  public String car;
    public void start()
    {
        System.out.println("Start engine");
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                '}';
    }

    public abstract void changegear();
    public abstract void inf0tainment();

        //create a abstract method -infotainment()
    //under abstract class create a variable name of car
    //in child class create method to set name of car must be private  and get name by getter and setter
    // implement infotainment in child class.
   public void stop(){
        System.out.println(" Stop engine");
   }

}
