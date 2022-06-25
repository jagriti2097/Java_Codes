package Strings;
import java.util.Scanner;

public class MinimumLengthWord {

    private static String minLengthWord(String str) {
        int count = 9999999;
        String minString = "";
        String finalString = "";
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                minString += str.charAt(i);
                length++;
            } else {
                if (count > length) {
                    finalString = minString;
                    count = length;
                }
                minString = "";
                length = 0;
            }
        }
        return finalString;
    }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();

            System.out.println(minLengthWord(str));
        }

}
