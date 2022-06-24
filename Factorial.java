package Basics;

import java.util.Scanner;

public class Factorial {

    public static int fact(int n){
        int ans = 1;
        for(int i =1; i<=n; i++){
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();

        System.out.println(fact(n));
    }
}
