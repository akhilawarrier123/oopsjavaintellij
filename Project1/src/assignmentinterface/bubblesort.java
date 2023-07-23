package assignmentinterface;

public class bubblesort implements sortable {
    @Override
    public void sort() {
        int[] a = {50, 30, 20, 10, 40};
        int temp = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = 1; j < a.length; j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }

        }
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }

    public static void main(String args[]) {
        bubblesort b = new bubblesort();
        b.sort();

    }
}

