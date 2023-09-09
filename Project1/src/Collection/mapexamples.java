package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class mapexamples {


    public static void main(String[] args) {


         class employee {
            private String name;
            private String company;
            private int age;

             public String getCompany() {
                 return company;
             }

             public void setCompany(String company) {
                 this.company = company;
             }

             public int getAge() {
                 return age;
             }

             public void setAge(int age) {
                 this.age = age;
             }

             public int getId() {
                 return id;
             }

             public void setId(int id) {
                 this.id = id;
             }

             private int id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

         class car {
            private String car_name;
            private String brand;

             public String getBrand() {
                 return brand;
             }

             public void setBrand(String brand) {
                 this.brand = brand;
             }

             public int getModel() {
                 return model;
             }

             public void setModel(int model) {
                 this.model = model;
             }

             private int model;

            public String getCar_name() {
                return car_name;
            }

            public void setCar_name(String car_name) {
                this.car_name = car_name;
            }
        }

            HashMap<employee, car> details = new HashMap<>();

            employee E1 = new employee();
            E1.setName("Vineeth");

            employee E2 = new employee();
            E2.setName("Athira");
            employee E3 = new employee();
            E3.setName("Meharuba");
            employee E4 = new employee();
            E4.setName("Antony");
            employee E5 = new employee();
            E5.setName("Mohan");

            car C1 = new car();
            C1.setCar_name("Honda city");
            car C2 = new car();
            C2.setCar_name("Tata Punch");
            car C3 = new car();
            C3.setCar_name("Hyundai i10");
            car C4 = new car();
            C4.setCar_name("susuki Brezza");
            car C5 = new car();
            C5.setCar_name("Kia Sonet");
        details.put(E1,C1);
        details.put(E2,C2);
        details.put(E3,C3);
        details.put(E4,C4);
        details.put(E5,C5);


        Set<employee>keys=details.keySet();
        Iterator<employee>Eiterator=keys.iterator();
        while(Eiterator.hasNext()){
            employee key=Eiterator.next();
            System.out.print(key.getName()+" ");
            System.out.println(details.get(key).getCar_name());
        }

    }
}
