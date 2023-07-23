package multiinheritance;

public class son extends father{
    String name;
    public void property4() {
        System.out.println("property4 of son ");
    }
        public static void main(String[] args)
        {
            son ob1=new son();
            son ob2=new son();


                    ob1.property1();
                    ob1.printDetails();
                    ob1.property3();
                    ob1.property4();
                    ob1.address="bangalore";
                    ob1.name = "ben";
                    ob1.home="vihar";
                    ob1.surname="johnson";
                    ob1.printDetails();



        }}