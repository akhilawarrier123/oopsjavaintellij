package Arraylist;

import java.util.ArrayList;

public class person {
    String name;
    String age;
    String gender;
    String phnum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhnum() {
        return phnum;
    }

    public void setPhnum(String phnum) {
        this.phnum = phnum;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<person>> personListofList = new ArrayList<>();

        ArrayList<person> listOfMale = new ArrayList<>();
        ArrayList<person> listOfFemale = new ArrayList<>();


        person maleObject1 = new person();
        maleObject1.setName("Raj");
        maleObject1.setGender("M");

        person maleObject2 = new person();
        maleObject2.setName("Dev");
        maleObject2.setGender("M");

        listOfMale.add(maleObject1);
        listOfMale.add(maleObject2);

        person femaleObject1 = new person();
        femaleObject1.setName("Riya");
        femaleObject1.setGender("F");

        person femaleObject2 = new person();
        femaleObject2.setName("Nikki");
        femaleObject2.setGender("F");

        listOfFemale.add(femaleObject1);
        listOfFemale.add(femaleObject2);

        personListofList.add(listOfMale); // 0
        personListofList.add(listOfFemale); // 1

        System.out.println(personListofList.get(0).get(0).name);

    }

}







