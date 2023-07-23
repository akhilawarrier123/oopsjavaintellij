package assignmentinterface;

public class football implements playable{
    @Override
    public void play() {
        System.out.println("the football game is scheduled on 26th August 2023");
    }

    public static void main(String args[]){
        football f=new football();
        f.play();
    }
}
