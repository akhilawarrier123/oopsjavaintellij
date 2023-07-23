package assignmentinterface;

public class basketball implements playable{
    @Override
    public void play() {
        System.out.println("the football game is scheduled on 10th August 2023");
    }

    public static void main(String args[]){
        basketball b=new basketball();
        b.play();
    }
}
