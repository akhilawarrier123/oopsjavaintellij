package multiinheritance;

public class daughter extends father {
    String daughtername;
    int age;

    public void property5() {
        System.out.println("property5 of daughter ");
        System.out.println(daughtername);
        System.out.println(age);
    }


    public static void main(String[] args)
    {
        daughter d1 = new daughter();

      d1.age=12;
      d1.daughtername="akhila";
        d1.home="flatno.2 ,bangalore";
        d1.surname="johnson";
        d1.printDetails();
        d1.property5();
    }}