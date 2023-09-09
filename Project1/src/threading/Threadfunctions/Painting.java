package threading.Threadfunctions;

public class Painting {
    boolean isoutlineDone=false;

    public synchronized void drawoutline(){//F1
        System.out.println(Thread.currentThread().getName()+"is Drawing outline");
        isoutlineDone=true;
        notify();



        }
    public synchronized void fillcolor(){
        while(!isoutlineDone){
            System.out.println(Thread.currentThread().getName()+" has to wait");
            try{
                wait();
            }
            catch(InterruptedException e) {


                throw new RuntimeException(e);
            }


            }

        System.out.println(Thread.currentThread().getName()+"fill color");



    }}

