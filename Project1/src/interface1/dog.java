package interface1;

public class dog implements animal{
    @Override
    public String bark() {
        return null;


}
    public void speak(){
        System.out.println("dog is barking");
    }

    public static void main (String args[]){
        dog d=new dog();
        d.bark();
        d.speak();
    }
}
