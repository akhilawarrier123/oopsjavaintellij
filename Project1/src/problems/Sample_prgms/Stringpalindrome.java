package problems.Sample_prgms;

public class Stringpalindrome {
    public static void main(String[] args) {
        String S="LEVEL";
        String Rev="";

       // System.out.println(S);
        for(int i=S.length()-1;i>=0;i--){
            Rev=Rev+S.charAt(i);
            if(S.equals(Rev)) {
                System.out.println("Palindrome");
            }
               // else{
               // System.out.println("Not Palindrome");
               // }
            }
        }


    }

