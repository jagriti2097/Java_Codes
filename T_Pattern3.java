/*

1
23
456
78910

 */

package Pattern;

import java.util.Scanner;

public class T_Pattern3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = s.nextInt();

        int k = 1;

        for (int i= 1; i<=num ; i++)
        {
            for (int j =1; j<=i; j++)
            {
                System.out.print(k);
                k+=1;
            }
            System.out.println();
        }
    }
}







