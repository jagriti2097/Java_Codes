/*

Number Star pattern 1
Send Feedback
Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
 */

package Pattern;

import java.util.Scanner;

public class NumberStar {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();

        for (int i =1 ;i<=num;i++)
        {
            int k = num;
            for (int j = 1; j <= num; j++)
            {
                if(i==k)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(k);
                }
                k-=1;
            }
            System.out.println();
        }
    }
}
