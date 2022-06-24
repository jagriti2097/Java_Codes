/*

4321
4321
4321
4321

 */

package Pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = s.nextInt();

        for (int i= 1; i<=num ; i++)
        {
            int k = num;
            for (int j =1; j<=num; j++)
            {
                System.out.print(k);
                k-=1;
            }
            System.out.println();
        }
    }
}







