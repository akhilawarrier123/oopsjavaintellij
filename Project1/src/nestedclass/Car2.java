package nestedclass;

public class Car2 {
    private String name;
    private String Brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    private String type;
    private int model;

    class Engine1{

        String Enginetype;
        int hp;

        public String getEnginetype() {
            return Enginetype;
        }

        public void setEnginetype(String enginetype) {
            Enginetype = enginetype;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public void showdetails_of_innerclass(){
            printdetails_outer_class();
            System.out.println(getHp());
            System.out.println(getEnginetype());
        }
    }
public void printdetails_outer_class(){
    System.out.println(getBrand());
    System.out.println(getName());
    System.out.println(getModel());
    System.out.println(getType());
}
    public static void main(String[] args) {
        Car2 C=new Car2();
        C.setBrand("Honda");
        C.setName("City");
        C.setModel(2023);
        C.setType("sedan");

        //outerclassname.innerclassname variablename=variablenameofclass.newinnerclass();
        Car2.Engine1 e1=C.new Engine1();
        e1.setEnginetype("Hybrid");
        e1.setHp(89);
        e1.showdetails_of_innerclass();
        System.out.println("******Engine2*********");
        Car2.Engine1 e2=C.new Engine1();
        e2.setEnginetype("Hybrid");
        e2.setHp(93);
        e2.showdetails_of_innerclass();

    }
}
