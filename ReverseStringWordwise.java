/*
Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always
 */

package Strings;

import java.util.Scanner;

public class ReverseStringWordwise {

    public static String reverseWordWise(String str) {
        String reversedString = "";
        int cws = 0; //current word start index
        int i = 0;
        for(; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                String word = "";
                int cwe = i-1; //current word end index
                for(int j=cws; j<=cwe; j++){
                    word += str.charAt(j);
                }
                reversedString = word + " " + reversedString;
                cws = i+1;
            }
        }
        String word = "";
        int cwe = i-1;
        for(int j=cws; j<=cwe; j++){
            word += str.charAt(j);
        }
        reversedString = word+ " " +reversedString;
        return reversedString;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverseWordWise(str));
    }
}
