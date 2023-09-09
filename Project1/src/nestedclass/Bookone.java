package nestedclass;

public class Bookone {
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

    public void printinfo_book() {
        System.out.println(getAuthorname());
        System.out.println(getBookname());

        class bookmark {
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
        }


        bookmark b = new bookmark();
        b.setLenth(45);
        b.setBreadth(20);
        b.setPgno(500);
        System.out.println(b.getLenth());
        System.out.println(b.getBreadth());
        System.out.println(b.getPgno());
    }

    static class page {
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

        public void printinfo() {
            System.out.println(getLenth());
            System.out.println(getBreadth());
            System.out.println(getPgno());

        }


    }

    public static void main(String[] args) {
        Bookone B=new Bookone();
        B.setAuthorname("Chethan Bhagat");
        B.setBookname("Half Girlfriend");
        B.printinfo_book();
        System.out.println("*********page details**********");

        Bookone.page P=new Bookone.page();
        P.setLenth(40);
        P.setBreadth(20);
        P.setPgno(200);
        P.printinfo();

    }
}

