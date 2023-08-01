package HasA;
//ASSOCIATION EG OF AGGREGATION
public class student {
    //aggregation here we can fill without address since the room is available. here student class not depend upon address.
    //class A not fully dependent on class B
    String name;
    int age;
    char gender;
    String course;
    Address address;
public void printdetails(){
    System.out.println(name);
    System.out.println(age);
    System.out.println(course);
    System.out.println(gender);

    }
    public static void main(String[] args) {
        student student1=new student();
        student1.name="Shekar";
        student1.age=25;
        student1.course="Science";
        student1.gender='M';


        //student student1=new student();
        student1.name="Shekar";
        student1.age=25;
        student1.course="Science";
        student1.gender='M';


    }
}
