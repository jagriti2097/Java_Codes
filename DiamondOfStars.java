/*

     *
    ***
   *****
    ***
     *
 */

package Pattern;

import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int num = s.nextInt();

            // dividing the number of rows
            int n1 = (num+1)/2; //3
            int n2 = num/2;     //2

        //      *
        //     ***
        //    *****
            for (int i= 1; i<=n1 ; i++)
            {
                for (int space = 1; space<=n1-i; space++)
                {
                    System.out.print(" ");
                }

                for (int j=1; j<=2*i-1; j++)
                {
                    System.out.print("*");
                }

                System.out.println();
            }
         //  ***
        //    *

        for (int i= n2; i>=1 ; i--)
        {
            for (int space = 1; space <= n2-i+1; space++)
            {
                System.out.print(" ");
            }

            for (int j=1; j<=2*i-1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        }
    }

