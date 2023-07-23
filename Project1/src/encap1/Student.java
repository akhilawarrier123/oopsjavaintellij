package encap1;

public class Student {
    private int stud_id;
    private String stud_name;

    @Override
    public String toString() {
        return "Student{" +
                "stud_id=" + stud_id +
                ", stud_name='" + stud_name + '\'' +
                ", grades=" + grades +
                '}';
    }

    private char grades;

    public int getStud_id() {
        return stud_id;
    }

    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
    }

    public String getStud_name() {
        return stud_name;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }
}
