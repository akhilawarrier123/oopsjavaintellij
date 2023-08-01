package nestedclass;

public class Laptop2 {
    private String name;
    private String Processor;
    private String RAM;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String processor) {
        Processor = processor;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    class KeyBoard{
        String Type;

        public String getType() {
            return Type;
        }

        public void setType(String Type) {
            this.Type = Type;
        }

        public void showdetailsinner(){
            printdetailsouter();

            System.out.println(getType());
        }
    }
    public void printdetailsouter(){

        System.out.println(getName());
        System.out.println(getRAM());
        System.out.println(getProcessor());
    }

    public static void main(String[] args) {
        Laptop2 L=new Laptop2();
        L.setName("Lenovo");
        L.setProcessor("intelcore i5");
        L.setRAM("8GB");

        System.out.println("****KeyBoard1****");
        Laptop2.KeyBoard K1=L.new KeyBoard();
        K1.setType("Basic");
        K1.showdetailsinner();

        System.out.println("****KeyBoard2****");
        Laptop2.KeyBoard K2=L.new KeyBoard();
        K2.setType("Extended");
        K2.showdetailsinner();

    }
}
