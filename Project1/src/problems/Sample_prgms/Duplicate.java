package problems.Sample_prgms;

public class Duplicate {
    public boolean CheckDupicate(String S){
for(int i=0;i<S.length();i++){
    for(int j=1;i<S.length();j++){
        if(S.charAt(i)==S.charAt(j)){
            System.out.println("contains duplicates");
        }

    }

}
return true;
    }

    public static void main(String[] args) {
       String Str="WELCOME";




        Duplicate D=new Duplicate();
        D.CheckDupicate("WELCOME");
    }
}
