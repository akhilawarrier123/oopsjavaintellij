package HasA;

public class Computer {
    private String name;
    private String Processor;
    private String RAM;

    private monitor Monitor;

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

    public monitor getMonitor() {
        return Monitor;
    }

    public void setMonitor(monitor monitor) {
        Monitor = monitor;
    }
public void printdetails(){
    System.out.println("The storage in RAM is  "+getRAM());
    System.out.println("The company name is  "+getName());
    System.out.println("The processor is  "+getProcessor());
    System.out.println("the monitor size is  "+Monitor.getSize());
    System.out.println("The monitor type is  "+Monitor.getType());
}
    public static void main(String[] args) {
        Computer C=new Computer();
        C.setName("Lenovo");
        C.setProcessor("intel Core i5");
        C.setRAM("8 GB");
        monitor m=new monitor();
        m.setSize("13 inch");
        m.setType("CRT");
        C.setMonitor(m);
        C.printdetails();

    }
}
