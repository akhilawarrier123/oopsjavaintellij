package encap;

public class productdriver {
    public static void main(String[] args)
    {
        product p1=new product();
        product p2=new product();
                product p3=new product();
                p1.setName("Colgate");
                p1.setType("Tooth Paste");
                p1.setPrice("Rs 25");
                p1.setQuantity(10);
        p2.setName("Rexona");
        p2.setType("Bathing Soap");
        p2.setPrice("Rs 50");
        p2.setQuantity(20);

        p3.setName("Harpic");
        p3.setType("Floor Cleaner");
        p3.setPrice("Rs 100");
        p3.setQuantity(15);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
