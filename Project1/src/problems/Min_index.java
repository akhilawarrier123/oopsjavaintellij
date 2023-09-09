package problems;

public class Min_index {

    public int minindex(int arr[]) {

        int index=0;

        for (int i = 1; i < arr.length; i++) {



            if (arr[i]<arr[index]){

                index=i;


            }
            // else {
            //      System.out.println("the smallest number is"+ arr.length);
            //  }

        }
        System.out.println("the index of smallest number is        " +index);
        return index;
    }


    public static void main (String[]args){
        int arr[] = {25,200,900,2,345,500,100};

        Min_index M=new  Min_index();
        int c= M.minindex(arr);
        // System.out.println(c);
    }
}
