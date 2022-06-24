/*

4444
333
22
1

 */

package Pattern;

import java.util.Scanner;

public class T_Pattern6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();

        int k = num;
        for (int i= 1; i<=num ; i++)
        {
            for (int j=1; j<=k; j++)
            {
                System.out.print(k);
            }
            k -= 1;
            System.out.println();
        }

    }
}
