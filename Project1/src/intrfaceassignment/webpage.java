package intrfaceassignment;

public class webpage implements searchable{
    @Override
    public void search(String keyword) {
String text="The Sun rises in the East";
if(text.contains(keyword))
{
System.out.println("The keyword is present");
}
  else {
      System.out .println("the keyword not present");
}
    }

    public static void main(String args[]){
        webpage w=new webpage();
        w.search("East");
    }

}
