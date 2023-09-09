package problems;

public class Max_num {


    public int Max(int[] A){

        int maximum=A[0];
        for(int i=0;i<A.length;i++){


            if(A[i]>maximum){
                maximum=A[i];
            }
        }
        System.out.println("The largest number of given array is     "+maximum);

        return maximum;

    }


    public static void main(String[] args) {
        int[] A={1500,159,135,200,690,345,1000};

        Max_num M=new Max_num();
        M.Max(A);


    }
}
