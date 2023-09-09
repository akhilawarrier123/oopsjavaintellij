package problems.Sample_prgms;

public class duplicates {
    public static void main(String[] args) {
        String Str = "WEL";
        for (int i = 0; i < Str.length(); i++) {
            for (int j = 1; j < Str.length(); j++) {
                if (Str.charAt(i) == Str.charAt(i)) {
                    System.out.println("Contains Duplicates");
                } else {
                    System.out.println("no duplicates");
                }
            }

        }

    }}