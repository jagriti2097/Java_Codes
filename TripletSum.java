/*
You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.
Note :
Given array/list can contain duplicate elements.
Input format :
First line of each test case or query contains an integer 'N' representing the size of the first array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.
Third line contains an integer 'X'.

Output format :
print the total number of triplets present in the array/list.
Output for every test case will be printed in a separate line.

Constraints :
0 <= N <= 10^2
0 <= X <= 10^9
Time Limit: 1 sec

Sample Input 1:
7
1 2 3 4 5 6 7
12
Sample Output 1:
5
Sample Input 2:

7
1 2 3 4 5 6 7
19

9
2 -5 8 -6 0 5 10 11 -3
10

Sample Output 2:
0
5


 Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
 */

package Arrays;

import java.util.Scanner;

public class TripletSum {

    public static int tripletSum(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    System.out.println(i + " "+j+" "+ k);
                    //System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");

                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
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
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of sum ");
        int x = s.nextInt();
        System.out.print(tripletSum(arr, x));
    }
}
