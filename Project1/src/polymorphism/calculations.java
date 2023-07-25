package polymorphism;
//overloading concept
public class calculations {
    public int add(int a,int b){
        int sum=a+b;

        return sum;

    }
    public float add(float a,float b){
        float sum= a+b;
        return sum;
    }


    public static void main(String args[]){


        calculations c=new calculations();
       int i= c.add(5,3);
        float j=c.add(0.1f,0.2f);
        System.out.println(i);
        System.out.println(j);
    }
}
