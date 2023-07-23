package intrfaceassignment;

public class document implements searchable{
    @Override
    public void search(String keyword) {
        String text ="Where there is a Will there is a Way";

        if(text.contains(keyword))
        {
            System.out.println("The keyword is present");
        }
        else {
            System.out .println("the keyword not present");
        }


    }
    public static void main(String args[]){
        document d=new document();
        d.search("Way");
    }
}
