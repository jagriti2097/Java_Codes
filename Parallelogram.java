/*

num = 5

*****
 *****
  *****
   *****
    *****

 */

package Pattern;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();

        for (int i= 1; i<=num ; i++)
        {
            for (int space = 1; space <= i-1; space++) {
                System.out.print(' ');
            }

            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
