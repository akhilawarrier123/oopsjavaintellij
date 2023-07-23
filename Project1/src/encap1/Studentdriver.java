package encap1;

public class Studentdriver
{
    char grade;
   public void addGrade(char a)
   {

    System.out.println("The corresponding grade is"    +grade );

   }

    public static void main(String[] args){
        Student S1=new Student();
        S1.setStud_id(1);
        S1.setStud_name("Vishak");

        S1.getStud_name();
        S1.getStud_id();



        Student S2=new Student();
        S2.setStud_id(2);
        S2.setStud_name("Ann");
        System.out.println(S1);
        System.out.println(S2);
        Studentdriver Sd=new Studentdriver();
        Sd.addGrade('A');

    }
}
