package Arrays;

import java.util.Scanner;

public class ArraySum {

    // Sum
    public static int sum(int arr[]){
        int sum = 0 ;
        for (int i = 0; i<arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }


    //Take Input
    public static int[] TakeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = s.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    //Print the array
    public static void PrintArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = TakeInput();
        PrintArray(arr);
        System.out.println("Sum of elements = " + sum(arr));
    }
}
