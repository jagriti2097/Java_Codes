/*

Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.

Input Format :
Integer N
Output Format :
Prime numbers in different lines

Constraints :
1 <= N <= 100

Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
 */

import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num = s.nextInt();

        for (int k=2; k<=num; k++)
        {

        }
        for (int i = 2; i<num; i++)
        {
            if (num%i == 0)
            {
                //System.out.println("Number is not prime");
                return;
            }

        }
        System.out.println(num);
    }
}
