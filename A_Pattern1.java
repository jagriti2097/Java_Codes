/*

ABCD
ABCD
ABCD
ABCD

 */

package Pattern;

import java.util.Scanner;

public class A_Pattern1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = s.nextInt();

        for (int i= 1; i<=num ; i++)
        {
            for (int j =1; j<=num; j++)
            {
                char k = (char) ('A' + j-1);
                System.out.print(k);
                k+=1;
            }
            System.out.println();
        }
    }
}
