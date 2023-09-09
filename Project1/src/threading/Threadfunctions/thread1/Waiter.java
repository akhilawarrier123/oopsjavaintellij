package threading.Threadfunctions.thread1;

public class Waiter implements Runnable{

    Hotel hotel;

    public Waiter(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void run() {
        hotel.servingfood();
    }
}
