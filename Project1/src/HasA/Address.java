package HasA;

public class Address {
    private int House_no;

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

    private  int Street;
    private String Landmark;
    private String District;
}
