package threading.Threadfunctions.thread1;

public class Customer implements Runnable{
    Hotel hotel;

    public Customer(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void run() {
        hotel.eatingfood();
    }
}
