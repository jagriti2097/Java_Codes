package Strings;

import java.util.Scanner;

public class ReverseEachWord {

    public static String reverseEachWord(String str) {

        String reversedString = "";
        int cws = 0; //current word Start
        int i =0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int cwe = i - 1; // current word end
                //Reverse current word and add to final string
                String reversedWord = "";
                for (int j = cws; j <= cwe; j++) {
                    reversedWord = str.charAt(j) + reversedWord;
                }
                reversedString += reversedWord +" ";
                cws = i+1;
            }
        }
        //doing for the last word
        String reversedWord = "";
        int cwe = i-1;
        for (int j = cws; j <= cwe; j++) {
            reversedWord = str.charAt(j) + reversedWord;
        }
        reversedString += reversedWord;
        return reversedString;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverseEachWord(str));
    }
}
