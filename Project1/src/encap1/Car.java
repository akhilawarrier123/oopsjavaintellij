package encap1;

public class Car
{
    private String com_name;
    private String mod_name;
    private int year;
    private String mileage;

    @Override
    public String toString() {
        return "Car{" +
                "com_name='" + com_name + '\'' +
                ", mod_name='" + mod_name + '\'' +
                ", year=" + year +
                ", mileage='" + mileage + '\'' +
                '}';
    }

    public String getMileage() {
        return mileage;
    }

    public String getCom_name() {
        return com_name;
    }

    public void setCom_name(String com_name) {
        this.com_name = com_name;
    }

    public String getMod_name() {
        return mod_name;
    }

    public void setMod_name(String mod_name) {
        this.mod_name = mod_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
