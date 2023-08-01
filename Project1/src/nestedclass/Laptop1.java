package nestedclass;

public class Laptop1 {

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

    class Motherboard{
        String RAM;

        public String getRAM() {
            return RAM;
        }

        public void setRAM(String RAM) {
            this.RAM = RAM;
        }

        public void showdetailsinner(){
            printdetailsouter();
            System.out.println("****Motherboard*****");
            System.out.println(getRAM());

        }
    }
public void printdetailsouter(){
    System.out.println(getName());
    System.out.println(getRAM());
    System.out.println(getProcessor());
}

    public static void main(String[] args) {
        Laptop1 L=new Laptop1();
        L.setName("HP");
        L.setProcessor("intelcore i3");
        L.setRAM("8GB");


        Laptop1.Motherboard M=L.new Motherboard();
        M.setRAM("4GB");
        M.showdetailsinner();


    }
}
