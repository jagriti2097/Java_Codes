/*
num=3
 *
 *1*
 *121*
 *12321*
 *121*
 *1*
 *

num=5
    *
    *1*
    *121*
    *12321*
    *1234321*
    *123454321*
    *1234321*
    *12321*
    *121*
    *1*
    *

 */

package Pattern;

import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : "); //3
        int num = s.nextInt();

        System.out.print("*");
        System.out.println();

        int n1 = num; //3
        int n2 = num-1; //2

        /*
            *
            *1*
            *121*
            *12321*

         */
        for (int i= 1; i<=n1 ; i++)
        {
            System.out.print("*");
            int k = 1;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(k);
                k += 1;
            }
            for (int j = i - 1; j >= 1; j--)
            {
                System.out.print(j);
            }

            System.out.print("*");
            System.out.println();
        }

        /*
               *121*
               *1*
         */

        for (int i = n2; i>=1; i--)
        {
            System.out.print("*");
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }

            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j);
            }

            System.out.print("*");
            System.out.println();
        }
        System.out.print("*");
    }
}
