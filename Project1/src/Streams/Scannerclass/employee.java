package Streams.Scannerclass;

import java.util.Scanner;

public class employee {

    String name;
    String c_name;
    int emp_id;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void showdetails(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getC_name());
        System.out.println(getEmp_id());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        employee E1 = new employee();

        System.out.println("Enter name");
        String name = scanner.nextLine(); // reads data as String

        System.out.println("Enter company name");
        String c_name = scanner.nextLine(); // reads data as String

        System.out.println("Enter employee id");
        Integer emp_id = scanner.nextInt(); // reads data as String

        System.out.println("Enter age");
        int age = scanner.nextInt();


        System.out.println("Details of Employee");
        E1.setName(name);
        E1.setC_name(c_name);
        E1.setEmp_id(emp_id);
        E1.setAge(age);

        E1.showdetails();

    }
}
