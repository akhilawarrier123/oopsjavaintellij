package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedemployee {

    private String name;
    private String surname;
    private int age;


    public void set_name(String n) {
        this.name = n;

    }

    public void set_surname(String n1) {
        this.surname = n1;
    }

    public void set_age(int n2) {
        this.age = n2;
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

    public void showprintdetails() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getSurname());
    }

    public static void main(String[] args) {
        LinkedHashSet<linkedemployee > employeesset = new LinkedHashSet<>();

        linkedemployee emp = new linkedemployee();

        emp.set_name("Akhila");
        emp.set_surname("Warrier");
        emp.set_age(26);

        linkedemployee emp1 = new linkedemployee();

        emp1.set_name("Sreejith");
        emp1.set_surname("Vadakkepattu");
        emp1.set_age(30);

        linkedemployee emp2 = new linkedemployee();

        emp2.set_name("Shekar");
        emp2.set_surname("Chorath");
        emp2.set_age(25);

        linkedemployee emp3 = new linkedemployee();

        emp3.set_name("Sreedhar");
        emp3.set_surname("Variyath");
        emp3.set_age(21);
        employeesset.add(emp);
        employeesset.add(emp1);
        employeesset.add(emp2);
        employeesset.add(emp3);

        Iterator<linkedemployee>iterator1 = employeesset.iterator();
        while (iterator1.hasNext()) {
            linkedemployee values = iterator1.next();
            // System.out.println(values);
            values.showprintdetails();

        }
    }
}