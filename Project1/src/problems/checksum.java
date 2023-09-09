package problems;

public class checksum {
    public static void main(String[] args) {

        int sum = 7;
        int result = 0;
        int array[] = {2, 4, 5, 78, 26, 1};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                result = array[i] + array[j];
                if (sum == result) {

                    System.out.println("True");
                }
            }
        }


        }

    }


