package Collection;

import encap.employee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class employee1 {

    private String name;
    private String surname;
    private int age;



    public void set_name(String n) {
        this.name=n;

    }

    public void  set_surname(String n1) {
        this.surname=n1;
    }

    public void set_age(int n2) {
        this.age=n2;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public int get_age(int n2) {
        return age;


    }
    public void showprintdetails(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getSurname());
    }

    public static void main(String[] args) {


        HashSet<employee1>setofemployees= new HashSet<>(); // empty set
        //LinkedHashSet<employee1>seofemployees=new LinkedHashSet<>();
        employee1 emp=new  employee1();

        emp.set_name("Akhila");
        emp.set_surname("Warrier");
        emp.set_age(26);

        employee1 emp1=new  employee1();

        emp1.set_name("Sreejith");
        emp1.set_surname("Vadakkepattu");
        emp1.set_age(30);

        employee1 emp2=new  employee1();

        emp2.set_name("Shekar");
        emp2.set_surname("Chorath");
        emp2.set_age(25);

        employee1 emp3=new  employee1();

        emp3.set_name("Sreedhar");
        emp3.set_surname("Variyath");
        emp3.set_age(21);

       setofemployees.add(emp);
        setofemployees.add(emp1);
        setofemployees.add(emp2);
        setofemployees.add(emp3);

        Iterator<employee1> iterator= setofemployees.iterator();
        while(iterator.hasNext()){
            employee1 values=iterator.next();
           // System.out.println(values);
            values.showprintdetails();
        }
    }
}
