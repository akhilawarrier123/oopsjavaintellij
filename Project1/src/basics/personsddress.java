package basics;

public class personsddress {
   private int House_no;
  private  int Street;
    private String Landmark;
    private String District;

    public int getHouse_no() {
        return House_no;
    }

    public void setHouse_no(int house_no) {
        House_no = house_no;
    }

    public int getStreet() {
        return Street;
    }

    public void setStreet(int street) {
        Street = street;
    }

    public String getLandmark() {
        return Landmark;
    }

    public void setLandmark(String landmark) {
        Landmark = landmark;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    private String State;
}
