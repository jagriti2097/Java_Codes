/*

       1
      232
     34543
    4567654
   567898765

 */

package Pattern;

import java.util.Scanner;

public class TriangleOfNumbers {
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
            int k = i;
            for (int j=1; j<=i; j++)
            {
                System.out.print(k);
                k += 1;
            }

            for (int j=2*i-2; j>=i; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
