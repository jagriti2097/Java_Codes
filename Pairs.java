package Arrays;

import java.util.Scanner;

public class Pairs {

    //Print Pairs

    public static void pairs(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
        }
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
    public static void PrintArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = TakeInput();
        PrintArray(arr);
        pairs(arr);
    }
}