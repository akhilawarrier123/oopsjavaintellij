package problems;

public class min_num {
    public int minnumber(int arr[]) {

        int minimum=arr[0];

        for (int i = 0; i < arr.length; i++) {



            if (arr[i]<minimum ){

                minimum=arr[i];


            }


        }
        System.out.println("the smallest number is        " + minimum);
        return minimum;
    }


        public static void main (String[]args){
            int arr[] = {1,25,200,900,50,345,500,11};

            min_num M=new  min_num();
           int c= M.minnumber(arr);
           // System.out.println(c);
        }
    }




