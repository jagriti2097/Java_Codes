/*
You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
 Note:
Change in the input array/list itself. You don't need to return or print the elements.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains the value of 'D' by which the array/list needs to be rotated.
Output Format :
For each test case, print the rotated array/list in a row separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^4
0 <= N <= 10^6
0 <= D <= N
Time Limit: 1 sec
Sample Input 1:
1
7
1 2 3 4 5 6 7
2
Sample Output 1:
3 4 5 6 7 1 2
Sample Input 2:
2
7
1 2 3 4 5 6 7
0
4
1 2 3 4
2
Sample Output 2:
1 2 3 4 5 6 7
3 4 1 2
 */

package Arrays;

import java.util.Scanner;

public class RotateArray {

//    public static void rotate(int[] arr, int d) {

        //Another approach
        // creating a new array of d size
        //   int[] temp = new int[d];

        //copy d elements in temp
//        for(int i=0; i<d;i++){
//            temp[i] = arr[i];
//        }
//        //shift arr elements to left by d positions
//        int i = 0;
//        for(;d<arr.length;){
//            arr[i] = arr[d];
//            i++;
//            d++;
//        }
//
//        // copy temp to arr
//        int j = 0;
//        for(int k=i; k<arr.length;k++){
//            arr[k] = temp[j];
//            j++;
//        }
//    }

        // CReating new array (one approach)
        public static void rotate ( int[] arr, int d) {
            int[] temp = new int[arr.length];
            int j = 0;
            for (int i = d; i < arr.length; i++) {
                temp[j] = arr[i];
                j++;
            }

            j = arr.length - 1;
            for (int i = d - 1; i >= 0; i--) {
                temp[j] = arr[i];
                j--;
            }

            for (int i = 0; i < temp.length; i++) {
                arr[i] = temp[i];
            }
        }

    public static void main(String[] args) {
        int[] arr= Basic.Takeinput();
       // Basic.PrintArray(arr);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter d ");
        int d = s.nextInt();
        rotate(arr,d);
        Basic.PrintArray(arr);
    }
}
