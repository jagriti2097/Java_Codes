package Arrays;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = s.nextInt();
        int arr[] = new int[n];

        //Taking Input
        for (int i =0;i<n;i++)
        {
            System.out.println("Enter the element at " + i + " index" );
            arr[i] = s.nextInt();
        }

        System.out.print("[" + " ");
        // Print the array
        for (int i =0; i<n; i++)
        {

            System.out.print(arr[i] + " ");
        }
        System.out.print("]" + " ");
    }
}
