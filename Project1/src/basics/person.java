package basics;

public class person {
    private String name;
    private int age;
    private personsddress Address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public personsddress getAddress() {
        return Address;
    }

    public void setAddress(personsddress address) {
        Address = address;
    }

    public void printdetails(){
        System.out.println(getName());
        System.out.println(getAge());
       // System.out.println(getAddress());
        System.out.println(Address.getHouse_no());
        System.out.println(Address.getStreet());
        System.out.println(Address.getLandmark());
        System.out.println(Address.getDistrict());
        System.out.println(Address.getState());



    }

    public static void main(String[] args) {
        person p1 = new person();
        p1.setName("Sreejith");

        p1.setAge(30);
        personsddress A1=new personsddress();
        A1.setHouse_no(24);
        A1.setStreet(40);
        A1.setLandmark("Varthur");
        A1.setDistrict("Bangalore");
        A1.setState("Karnataka");


        p1.setAddress(A1);
        p1.printdetails();


    }
}