package Basics;

import java.util.Scanner;

public class SumOfNnos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(" Enter the Number : ");
        int num = s.nextInt();

        int sum = 0;
        int i = 0;
        while (i<=num)
        {
            sum += i;
            i += 1;
        }
        System.out.print(sum);
    }

}
