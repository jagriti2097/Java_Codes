/*

1111
2222
3333
4444

 */

package Pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = s.nextInt();

        for (int i= 1; i<=num ; i++)
        {
            for (int j =1; j<=num; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}







