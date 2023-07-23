package encap1;

public class Employeedriver
{
    public static void main(String[] args)
    {

        Employee E1=new Employee();

        E1.setEmp_id(11);
        E1.setEmp_name("Kalpana");
        E1.setEmp_salary(50000);
        Employee E2=new Employee();
        E2.setEmp_id(12);
        E2.setEmp_name("Sujith");
        E2.setEmp_salary(85000);
        E1.getEmp_salary();
        E2.getEmp_salary();

        System.out.println(E1 +","  +       "The salary is "+ E1.getEmp_salary());

        System.out.println(E2+","  +        "The salary is "+ E2.getEmp_salary());

    }
}
