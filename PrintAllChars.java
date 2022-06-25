package Strings;

import java.util.Scanner;

public class PrintAllChars {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str1 = s.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + " ");
        }
    }
}
