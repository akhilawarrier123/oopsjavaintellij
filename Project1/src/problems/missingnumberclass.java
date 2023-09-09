package problems;

public class missingnumberclass {

    public int missing_number(int arr[]){
        //logic
        int n=arr.length + 1;
        int sum_oneto_n=0;

        //step1:sum 1 to n
     for(int i=1;i<=n;i++){
         sum_oneto_n=sum_oneto_n+i;
        }


     //step 2: find sum of our array

        int Sum_array=0;
     for(int i=0;i<arr.length;i++){
         Sum_array=Sum_array+arr[i];
     }



     //step 3: diff= difference of 2 arrays
        int Missing_no=sum_oneto_n- Sum_array;

     return Missing_no;
    }

    public static void main(String[] args) {
        int arr[]={1,5,3,2};

        missingnumberclass M=new missingnumberclass();
        M.missing_number(arr);
        int p= M.missing_number(arr);
        System.out.println("The missing number is  "+p);
    }
}
