package Arrays;

import java.util.Scanner;

public class Basic {

    //Take Input
    public static int[] Takeinput(){
        Scanner s = new Scanner(System.in);
        System.out.print("Length = ");
        int n = s.nextInt();

        System.out.print("Enter array elements ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }

    //Print Array
    public static void PrintArray(int[] arr){
        for(int element : arr){
            System.out.print(element +" ");
        }
    }
}
