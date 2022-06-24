/*

Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7

 */
package Basics;
import java.util.Scanner;
import java.lang.Math;
public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int n = s.nextInt();

        int power = 0;
        double ans = 0;
        while (n>0)
        {
            int digit = n%10;
            n=n/10;
            ans += (digit * Math.pow(2,power));
            power+=1;
        }
        System.out.print((int)ans);
    }
}
