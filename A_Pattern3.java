/*

A
BC
CDE
DEFG

 */

package Pattern;

import java.util.Scanner;

public class A_Pattern3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = s.nextInt();

        for (int i= 1; i<=num ; i++)
        {
            char k = (char) ('A' + i-1);
            for (int j =1; j<=i; j++)
            {
                System.out.print(k);
                k+=1;
            }
            System.out.println();

        }
    }
}
