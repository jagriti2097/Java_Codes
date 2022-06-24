
package Basics;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = s.nextInt();

        int i = 2;
        while (i<num) // can use (i<=n/2) coz factors exist in pairs.
        {
            if (num%i == 0)
            {
                System.out.println(num + " is not a prime number");
                return;
            }
            i++;
        }

            System.out.println(num + " is a prime number");


        // OR
//        boolean isPrime=true;
//        while (i<=num-1) // can use (i<=n/2) coz factors exist in pairs.
//        {
//            if (num%i == 0)
//            {
//                isPrime=false;
//            }
//            i++;
//        }
//        if (isPrime)
//        {
//            System.out.println(num + " is a prime number");
//        }
//        else
//        {
//            System.out.println(num + " is not a prime number");
//        }
    }

}

