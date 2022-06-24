/*
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.
Note:
You need to change in the given array/list itself. Hence, no need to return or print anything.
Input format :
First line of each test case or query contains an integer 'N' representing the size of the array/list.
Second line contains 'N' single space separated integers(all 0s and 1s) representing the elements in the array/list.
Output format :
Print the sorted array/list elements in a row separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:

7
0 1 1 0 1 0 1
Sample Output 1:
0 0 0 1 1 1 1
Sample Input 2:

8
1 0 1 1 0 1 0 1

5
0 1 0 1 0
Sample Output 2:
0 0 0 1 1 1 1 1

0 0 0 1 1
 */

package Arrays;

import java.util.Scanner;

public class Sort01 {
    //Sort this works prfctly fine but the constraint is we need to traverse the array only once

//    public static void sort(int[] a){
//        for(int i=0;i<a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i] != 0){
//                    if(a[j]==0){
//                        int k = a[i];
//                        a[i] = a[j];
//                        a[j] = k;
//                        break;
//                    }
//                }
//            }
//        }
//    }

    // Sort

//    public static void Sort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = arr.length - 1; j > i; j--) {
//                System.out.println(i+" "+j);
//                if (arr[i] != 0) {
//                    if (arr[j] != 1) {
//                        int k = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = k;
//                    }
//                }
//            }
//        }
//    }

    //sort
    public static void Sort(int[] arr){
        int i = 0;
        int j= arr.length - 1;
        while (i<j){
            if (arr[i]==0){
                i++;
            }
            else if (arr[j]==1){
                j--;
            }
            if(arr[i] != 0 && arr[j] !=1) {
                int k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
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
        System.out.println("Array ");
        PrintArray(arr);
        Sort(arr);
        System.out.println("Sorted Array");
        PrintArray(arr);
    }
}
