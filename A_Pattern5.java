/*

E
DE
CDE
BCDE
ABCDE

 */

package Pattern;

import java.util.Scanner;

public class A_Pattern5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = s.nextInt();

        for (int i= 1; i<=num ; i++)
        {
            char k = (char) ('A' + num-i);
            for (int j =1; j<=i; j++)
            {
                System.out.print(k);
                k+=1;
            }
            System.out.println();

        }
    }
}
