package encap;

import java.util.ArrayList;

public class employeedriver {

    public static void main(String[] args) {

employee emp=new  employee();

emp.set_name("Akhila");
emp.set_surname("Warrier");
        emp.set_age(26);

        employee emp1=new  employee();

        emp1.set_name("Sreejith");
        emp1.set_surname("Vadakkepattu");
        emp1.set_age(30);

        employee emp2=new  employee();

        emp2.set_name("Shekar");
        emp2.set_surname("Chorath");
        emp2.set_age(25);

        employee emp3=new  employee();

        emp3.set_name("Sreedhar");
        emp3.set_surname("Variyath");
        emp3.set_age(21);

        ArrayList<employee> A1= new ArrayList<employee>();
        A1.add(emp);
        A1.add(emp1);
        A1.add(emp2);
        A1.add(emp3);

        for(employee X:A1) {
            System.out.println(X);
        }

                   System.out.println( emp);
          System.out.println( emp1);
           System.out.println( emp2);
           System.out.println( emp3);
           }

    }


