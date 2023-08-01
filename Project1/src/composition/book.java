package composition;

public class book {
String type;
String name;
private page p;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public page getP() {
        return p;
    }

    public void setP(page p) {
        this.p = p;
    }
public void printdatails(){
    System.out.println(getName());
    System.out.println(getType());
    System.out.println(p.getPages());
}
    public static void main(String[] args) {
        book b1=new book();
        page P1=new page();
        P1.setPages(200);
        b1.setType("Novel");
        b1.setName("Othello");
        b1.setP(P1);
        b1.printdatails();

        book b2=new book();
        page P2=new page();
        P2.setPages(300);
        b2.setType("Novel");
        b2.setName("Harry Potter");
        b2.setP(P2);
        b2.printdatails();


    }
}
