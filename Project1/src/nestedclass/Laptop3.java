package nestedclass;

public class Laptop3 {

    private String name;
    private String Processor;

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

    class Motherboard {
        String RAM;

        public String getRAM() {
            return RAM;
        }

        public void setRAM(String RAM) {
            this.RAM = RAM;
        }

        public void showdetailsMotherboard() {
            printdetailsouter();

            System.out.println((getRAM()));
        }
    }
        class Keyboard{
            String Type;

            public String getType() {
                return Type;
            }

            public void setType(String type) {
                Type = type;
            }


            public void showdetailsKeyboard(){
                printdetailsouter();

                System.out.println((getType()));
            }

        }



    public void printdetailsouter(){
        System.out.println(getName());
        System.out.println(getProcessor());
    }

    public static void main(String[] args) {
        Laptop3 L3=new Laptop3();
        L3.setName("Azer");
        L3.setProcessor("intelcore i3");


        System.out.println("Motherboard");
        Laptop3.Motherboard M=L3.new Motherboard();
        M.setRAM("4GB");
        M.showdetailsMotherboard();

        System.out.println("Keyboard");
        Laptop3.Keyboard K=L3.new Keyboard();
        K.setType("Extended");
        K.showdetailsKeyboard();

    }


}
