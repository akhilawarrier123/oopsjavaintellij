package nestedclass; // eg of static nested class

public class Book1 {

    private String bookname;
    private String authorname;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    static class page{
        int lenth;
        int breadth;
        int pgno;

        public int getLenth() {
            return lenth;
        }

        public void setLenth(int lenth) {
            this.lenth = lenth;
        }

        public int getBreadth() {
            return breadth;
        }

        public void setBreadth(int breadth) {
            this.breadth = breadth;
        }

        public int getPgno() {
            return pgno;
        }

        public void setPgno(int pgno) {
            this.pgno = pgno;
        }
        public void  printinfo(){
            System.out.println(getLenth());
            System.out.println(getBreadth());
            System.out.println(getPgno());




    }





    }
    public void printinfo_book(){
        System.out.println(getAuthorname());
        System.out.println(getBookname());
    }

    public static void main(String[] args) {
        Book1 B=new Book1();
        B.setAuthorname("Arundathi Rai");
        B.setBookname("God of Smallthings");
        B.printinfo_book();
        System.out.println("*********page details**********");

        Book1.page P=new page();
        P.setLenth(40);
        P.setBreadth(20);
        P.setPgno(200);
        P.printinfo();

    }
}
