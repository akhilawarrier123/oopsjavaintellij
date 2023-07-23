package encap;

public class employee {

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

    public String get_name(String n) {
        return name;
    }

    public String get_surname(String n1) {
        return surname;
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

}