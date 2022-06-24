package Basics;
import java.util.Scanner;

public class Add {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1=s.nextInt();
        System.out.print("Enter Second Number : ");
        int num2=s.nextInt();

        System.out.println("Result : "+ (num1+num2));

    }
}
