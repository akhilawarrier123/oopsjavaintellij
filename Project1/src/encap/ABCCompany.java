package encap;

import java.util.ArrayList;

public class ABCCompany {

    static ArrayList<employee> employeelist = new ArrayList<employee>();

    public static void main(String[] args) {


        employee emp = new employee();

        emp.set_name("Akhila");
        emp.set_surname("Warrier");
        emp.set_age(26);

        employee emp1 = new employee();

        emp1.set_name("Sreejith");
        emp1.set_surname("Vadakkepattu");
        emp1.set_age(30);

        employee emp2 = new employee();

        emp2.set_name("Shekar");
        emp2.set_surname("Chorath");
        emp2.set_age(25);

        employee emp3 = new employee();

        emp3.set_name("Sreedhar");
        emp3.set_surname("Variyath");
        emp3.set_age(21);

        ABCCompany.employeelist.add(emp);

        ABCCompany.employeelist.add(emp1);

        ABCCompany.employeelist.add(emp2);

        ABCCompany.employeelist.add(emp3);

        ArrayList<employee> Newlist = ABCCompany.employeelist;

        for(int i=0;i< Newlist.size();i++)
        {
            employee obj= Newlist.get(i);
            obj.showprintdetails();


            
    }
}}