/*

nCr = n!/(r! * (n-r)!)

 */
package Basics;
import java.util.Scanner;

public class nCr {
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = s.nextInt();
        System.out.print("Enter r : ");
        int r = s.nextInt();

        System.out.print( factorial(n) / (factorial(r) * factorial(n-r)) ) ;
    }

    public static int factorial (int num)
    {
        int fact = 1;
        for (int i =1; i<=num; i++)
        {
            fact *= i;
        }
        return fact;
    }

}
