package HasA;

public class Hotel {
    String name;
    String location;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    Room room;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
public void printdetails(){
        System.out.println(getName());
        System.out.println(getLocation());
        System.out.println(room.getAC());
        System.out.println(room.getNormal());
    }
    public static void main(String[] args) {
        Hotel H=new Hotel();
        H.setName("Paradise");
        H.setLocation("Whitefield");

        Room R=new Room();
        R.setNormal(20);
        R.setAC(25);
        H.setRoom(R);
        H.printdetails();
    }
}
