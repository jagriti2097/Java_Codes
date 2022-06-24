/*

Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17
 */
package Basics;
import java.util.Scanner;

public class TermsofAP {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int x = s.nextInt();

        int count = 0;
        int i = 1;
        while (i <= 1000){
            if( (3*i+2) % 4 != 0  ){
                System.out.print(3*i+2 + " ");
                count++;
            }
            if(count == x)
            {
                return;
            }

            i++;
        }
    }
}