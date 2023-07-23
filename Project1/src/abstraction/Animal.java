package abstraction;

public abstract class Animal {

    public void walks()                         //implemented method
    {  System.out.println("Every animal walks");
    }


    public void sleeps()
    {
        System.out.println(" Every animal sleeps");
    }

    public abstract void sound();       //unimplemented method
}
