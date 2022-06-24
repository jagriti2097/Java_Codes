/*

    1
   12
  123

 */

package Pattern;

import java.util.Scanner;

public class T_Pattern5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();

        for (int i= 1; i<=num ; i++)
        {
            for (int space =1; space<=num-i; space++)
            {
                System.out.print(" ");
            }

            int k = 1;
            for (int j=1; j<=i; j++)
            {
                System.out.print(k);
                k += 1;
            }

            System.out.println();
        }

    }
}
