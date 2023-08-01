package composition;

public class College {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departments getDep() {
        return Dep;
    }

    public void setDep(Departments dep) {
        Dep = dep;
    }

    public Rooms getRoom() {
        return Room;
    }

    public void setRoom(Rooms room) {
        Room = room;
    }

    private String name;
    private Departments Dep;
    private Rooms Room;
public void printdetails(){
    System.out.println(getName());
    System.out.println(Dep.getDname());
    System.out.println(Dep.getStrength());
    System.out.println(Room.getClassroom());
    System.out.println(Room.getClassnumber());
    System.out.println(Room.getClasstype());
}
    public static void main(String[] args) {
        College C1=new College();
        C1.setName("NIT");
        C1.getName();

        Departments D1=new Departments();
        D1.setDname("EEE");
        D1.setStrength(72);


        Rooms R1=new Rooms();
        R1.setClassroom(1);
        R1.setClassnumber("2A");
        R1.setClasstype("Normal");

                C1.setDep(D1);
                C1.setRoom(R1);
                C1.printdetails();
    }
}
