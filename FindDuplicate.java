/*
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2).
 ach number is present at least once. That is, if N = 5,
 the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice.
 You need to find and return that duplicate number present in the array.
Note :
Duplicate number is always present in the given array/list.
Input format :
First line of each test case or query contains an integer 'N' representing the size of the array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.

Output Format :
For each test case, print the duplicate element in the array/list.
Output for every test case will be printed in a separate line.
Constraints :
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
9
0 7 2 5 4 7 1 3 6
Sample Output 1:
7
Sample Input 2:
5
0 2 1 3 1
Sample Output 2:
1
 */

package Arrays;

import java.util.Scanner;

public class FindDuplicate {

    //Find Duplicate
    public static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count != 1) {
                return arr[i];
            }
        }
        return -1;
    }


    //Take Input
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = s.nextInt();
        System.out.println("Enter Elements of the array");
        int[] arr = new int[n];
        for (int i=0; i<n;i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }

    // Print array
    public static void printArray(int[] arr){
        System.out.println("Array");
        for(int element : arr){
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        printArray(arr);
        System.out.print("Duplicate Element : ");
        System.out.println(findDuplicate(arr));
    }
}
