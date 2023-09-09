package problems.Sample_prgms;

public class Stringreverse {
    public static void main(String[] args) {
        String S="TESTING";
        String Rev="";
        for(int i=S.length()-1;i>=0;i--){
            Rev= Rev+S.charAt(i);

        }
        System.out.println("The reverse of String :  "+ Rev);
    }
}
