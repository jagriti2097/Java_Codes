/*
For a given input string(str), write a function to print all the possible substrings.
Substring
A substring is a contiguous sequence of characters within a string.
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
Print the total number of substrings possible, where every substring is printed on a single line and hence the total number of output lines will be equal to the total number of substrings.
Note:
The order in which the substrings are printed, does not matter.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abc
Sample Output 1:
a
ab
abc
b
bc
c
 Sample Input 2:
co
Sample Output 2:
c
co
o
 */
package Strings;

import java.util.Scanner;

public class AllSubstrings {

    //printing length wise
    public static void printSubstrings(String str) {
        for(int len=1;len<=str.length();len++){
            for(int start=0; start<=str.length()-len; start++){
                int end = start + len - 1;
                System.out.println(str.substring(start,end+1));
            }
        }
    }

    // starting from particular index

//    public static void printSubstrings(String str) {
//        for(int start=0;start<str.length();start++){
//            for(int end=start;end<str.length();end++){
//                System.out.println(str.substring(start,end+1));
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        printSubstrings(str);
    }
}
