package nestedclass;

public class Hotel2 {
   private String name;
    private String location;


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
        class reception{
            int receptionists;
            int camera;

            public int getReceptionists() {
                return receptionists;
            }

            public void setReceptionists(int receptionists) {
                this.receptionists = receptionists;
            }

            public int getCamera() {
                return camera;
            }

            public void setCamera(int camera) {
                this.camera = camera;
            }



        }

        reception r=new reception();
        r.setCamera(5);
        r.setReceptionists(3);

        System.out.println(r.getCamera());
        System.out.println(r.getReceptionists());

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
            System.out.println("No. of AC rooms:"+getNormal());
        }
    }
    public void printdetails_Hotel(){
        System.out.println("Name:  "+ getName());
        System.out.println("Location: "+getLocation());
    }
    public static void main(String[] args) {

        Hotel2 H=new Hotel2();
        H.setName("Sopanam");
        H.setLocation("Trivandrum");

        H.printdetails_Hotel();


        System.out.println("***** Details of Rooms available*************");


        Hotel2.room R=new Hotel2.room();
        R.setAC(25);
        R.setNormal(20);
        R.printdetails_room();
    }
}
