package Basics;
import java.util.Scanner;

public class nthPrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int n = s.nextInt();

        int num = 100; // can be any number (just to generate prime no. series)
        int count=0;

        for (int n1 = 2; n1 <= num; n1++) {
            boolean isPrime = true;
            for (int i = 2; i < n1; i++) {
                if (n1 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                count++;
                if (count == n) {
                    System.out.println(n1);
                }
            }
        }
    }
}
