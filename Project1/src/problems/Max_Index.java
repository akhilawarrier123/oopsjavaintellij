package problems;

public class Max_Index {

    public int Maxarrayindex(int[] array){



        int index=0;
        for(int i=1;i<array.length;i++){


            if(array[i]>array[index]){
                index=i;



            }


        }
        System.out.println("The index of largest number of given array is     "+index);

        return index;

    }


    public static void main(String[] args) {
        int[] array={159,260,12,5,600,9,300,120,243,342,90,22,15};

        Max_Index M=new Max_Index();
        M.Maxarrayindex(array);


    }
}
