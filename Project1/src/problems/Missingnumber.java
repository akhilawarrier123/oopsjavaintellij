package problems;

public class Missingnumber {

   public int  number (int a[]){
int sum=0;
int sn=0;
int diff=0;





for(int i=0; i<a.length+1;i++)
{
    sn=sn+a[i]; // 1 to n
}



     for (int i=0;i<a.length;i++)
     {
         sum=sum+a[i];
     }


        diff=sn-sum;

       return diff;

   }


    public static void main(String[] args) {

       int a[]={1,3,6,5,4};
       Missingnumber M=new Missingnumber();
      int k  = M.number(a);

        System.out.println("The missing number is"+ k);

    }
}
