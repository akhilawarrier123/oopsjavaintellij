package HasA;

public class Home {
   private int wardrobe;
   private int washing_machine;
   private int geyser;

    public int getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(int wardrobe) {
        this.wardrobe = wardrobe;
    }

    public int getWashing_machine() {
        return washing_machine;
    }

    public void setWashing_machine(int washing_machine) {
        this.washing_machine = washing_machine;
    }

    public int getGeyser() {
        return geyser;
    }

    public void setGeyser(int geyser) {
        this.geyser = geyser;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    private Furniture furniture;
public void printdetails(){
    System.out.println( "the no. of geyser is  "+getGeyser());
    System.out.println("the no. of wardrobe is  "+getWardrobe());
    System.out.println("the no. of washing_machine is  "+getWashing_machine());
    System.out.println("the no. of chair is  "+furniture.getChair());
    System.out.println("the no. of cot is  "+furniture.getCot());
    System.out.println("the no. of table is  "+furniture.getTable());
}

    public static void main(String[] args) {
     Home h=new Home();
     h.setGeyser(3);
     h.setWashing_machine(1);
     h.setWardrobe(5);
     Furniture f=new Furniture();
     f.setChair(10);
     f.setCot(4);
     f.setTable(4);
     h.setFurniture(f);
     h.printdetails();
    }
}