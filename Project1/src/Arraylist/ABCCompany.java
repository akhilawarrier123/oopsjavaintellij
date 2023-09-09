package Arraylist;

import encap.employee;

import java.util.ArrayList;

public class ABCCompany {

    static ArrayList<encap.employee> employeelist = new ArrayList<encap.employee>();

    public static void main(String[] args) {


        encap.employee emp = new encap.employee();

        emp.set_name("Akhila");
        emp.set_surname("Warrier");
        emp.set_age(26);

        encap.employee emp1 = new encap.employee();

        emp1.set_name("Sreejith");
        emp1.set_surname("Vadakkepattu");
        emp1.set_age(30);

        encap.employee emp2 = new encap.employee();

        emp2.set_name("Shekar");
        emp2.set_surname("Chorath");
        emp2.set_age(25);

        encap.employee emp3 = new encap.employee();

        emp3.set_name("Sreedhar");
        emp3.set_surname("Variyath");
        emp3.set_age(21);

        ABCCompany.employeelist.add(emp);

        ABCCompany.employeelist.add(emp1);

        ABCCompany.employeelist.add(emp2);

        ABCCompany.employeelist.add(emp3);

        ArrayList<encap.employee>Newlist=new ArrayList<encap.employee>();
        for(int i=0;i< employeelist.size();i++)
        {
            employee obj= Newlist.get(0);
            
            
    }
}}