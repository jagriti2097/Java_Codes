package Arrays;

import java.util.Scanner;

public class LargestElement {

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

    //Find largest
    public static int largest(int[] arr){
        int largest = arr[0];
        for (int i=0; i<arr.length;i++)
        {
            if ( arr[i]>largest ){
                largest = arr[i];
            }
        }
        return largest;
    }


    public static void main(String[] args) {
        int arr[] = TakeInput();
        PrintArray(arr);
        int largest =  largest(arr);
        System.out.println("Largest element = " + largest);
    }
}