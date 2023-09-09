package problems.Sample_prgms;

public class largest2 {
    public static void main(String[] args) {
        int []A={12,78,34,67,31,90,87};
        int temp=0;
        int i=0;
        for( i=0;i< A.length-1;i++){
            for(int j=1;j<A.length-1;j++){
              temp=A[i];
              A[i]=A[j];
              A[j]=temp;
            }
        }
        System.out.println(A[i]);

    }
}
