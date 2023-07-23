package assignmentinterface;

public class selectionsort implements sortable{
    @Override
    public void sort() {
        int[] a = {50, 30, 20, 10, 40};

        for (int i = 0; i < a.length - 1; i++) {
            int m = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[m]) {
                    m = j;//searching for lowest index
                }
            }
            int smallerNumber = a[m];
            a[m] = a[i];
            a[i] = smallerNumber;
        }
            for (int k = 0; k < a.length; k++) {
                System.out.println(a[k]);
            }
    }

    public static void main(String args[]) {
        selectionsort s = new   selectionsort();
        s.sort();

    }
}





