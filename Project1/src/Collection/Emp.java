package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Emp {
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


        HashMap<String,Emp> hashmap=new HashMap<>();//empty

        Emp emp=new  Emp();

        emp.set_name("Akhila");
        emp.set_surname("Warrier");
        emp.set_age(26);

        Emp emp1=new  Emp();

        emp1.set_name("Sreejith");
        emp1.set_surname("Vadakkepattu");
        emp1.set_age(30);

        Emp emp2=new  Emp();

        emp2.set_name("Shekar");
        emp2.set_surname("Chorath");
        emp2.set_age(25);
        Emp emp3=new  Emp();

        emp3.set_name("Sreedhar");
        emp3.set_surname("Variyath");
        emp3.set_age(21);

        hashmap.put("employee_1",emp);
        hashmap.put("employee_2",emp1);
        hashmap.put("employee_3",emp2);
        hashmap.put("employee_4",emp3);

        Set<String>keysets=hashmap.keySet();
        Iterator<String> iterator= keysets.iterator();
        while(iterator.hasNext()){

            String key=iterator.next();//now java and again it changes
            System.out.print(key+"  :  ");
            System.out.println(hashmap.get(key));
        }
    }
}
