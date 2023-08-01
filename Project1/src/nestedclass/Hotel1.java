package nestedclass; // Static inner class

public class Hotel1 {
    String name;
    String location;

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

    static class room{
        int AC;
        int Normal;

        public int getAC() {
            return AC;
        }

        public void setAC(int AC) {
            this.AC = AC;
        }

        public int getNormal() {
            return Normal;
        }

        public void setNormal(int normal) {
            Normal = normal;
        }

        public void printdetails_room(){
            System.out.println("No. of AC rooms:  "+getAC());
            System.out.println("No. of AC rooms:vv"+getNormal());
        }
    }
public void printdetails_Hotel(){
    System.out.println("Name:  "+ getName());
    System.out.println("Location: "+getLocation());
}
    public static void main(String[] args) {

        Hotel1 H=new Hotel1();
        H.setName("Taj");
        H.setLocation("Kochi");
        H.printdetails_Hotel();


        System.out.println("***** Details of Rooms available*************");


        Hotel1.room R=new room();
        R.setAC(25);
        R.setNormal(20);
        R.printdetails_room();
    }
}
