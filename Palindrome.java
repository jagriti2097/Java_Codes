package Strings;

import java.util.Scanner;

public class Palindrome {

    public static boolean palindrome(String str) {
        //String reversedString = "";
        int i = 0;
        int j = str.length() - 1;
        for (; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

//    public static boolean palindrome(String str){
//        String reversedString = "";
//        for (int i =0; i<str.length(); i++) {
//            reversedString = str.charAt(i) + reversedString;
//        }
//        if(str.equals(reversedString)){
//            return true;
//        }
//        return false;
//    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(palindrome(str));
    }
}
