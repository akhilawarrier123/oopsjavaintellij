package multiinheritance;

public class grandfather
{
    String home;
    String surname;
    public void property1()
    {
        System.out.println("property1 of grandfather ");

    }
    private void property2()
    {
        System.out.println(" property2 of grandfather");
    }
    public void printDetails()
    {
        System.out.println( home);
        System.out.println( surname);

    }

    public static void main(String[] args)
    {
        System.out.println(" property2 of grandfather");
        grandfather ob2=new grandfather();

    }}