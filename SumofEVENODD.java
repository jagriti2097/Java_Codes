/*

Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places!
That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.

Input format :
 Integer N

Output format :
Sum_of_Even_Digits Sum_of_Odd_Digits
(Print first even sum and then odd sum separated by space)

Constraints
0 <= N <= 10^8

Sample Input 1:
1234
Sample Output 1:
6 4
 */

package Basics;
import java.util.Scanner;

public class SumofEVENODD {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = s.nextInt();

        int num1 = num;
        int sum_even = 0;
        int sum_odd = 0;
        int digit = 0;

        while (num!=0)
        {

            digit = num%10;


            if (digit % 2 == 0)
            {
                sum_even += digit;
                num = num / 10;
            }
            else
            {
                sum_odd += digit;
                num = num / 10;
            }
        }

        System.out.println(sum_even + " " + sum_odd);

    }
}














