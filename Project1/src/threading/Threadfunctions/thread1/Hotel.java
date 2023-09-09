package threading.Threadfunctions.thread1;

public class Hotel {
    boolean isfoodready= false;
    public synchronized void servingfood() {//waiter
        System.out.println(Thread.currentThread().getName() + "    food is served");
        isfoodready = true;
        notify();
    }
        public synchronized void eatingfood(){
            while(!isfoodready){
                System.out.println(Thread.currentThread().getName()+"    has to wait for food to get ready");
                try{
                    wait();
                }
                catch(InterruptedException e) {


                    throw new RuntimeException(e);
                }


            }

            System.out.println(Thread.currentThread().getName()+"   food is served and ready to eat");



        }



    }

