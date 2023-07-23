package assignmentinterface;

public class volleyball implements playable{
    @Override
    public void play() {
        System.out.println("the volleyball game is scheduled on 28th july 2023");
    }

    public static void main(String args[]){
        volleyball v=new volleyball();
        v.play();
    }
}
