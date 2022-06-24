/*

You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 Note:
Unique element is always present in the array/list according to the given condition.
Input format :
First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
print the unique element present in the array.
Constraints :
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
7
2 3 1 6 3 6 2
Sample Output 1:
1
Sample Input 2:
5
2 4 7 2 7
Sample Output 2:
4
10
 */

package Arrays;

import java.util.Scanner;

public class FindUnique {

    public static int findUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++){
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count == 1){
                return arr[i];
            }
        }
        return 0;
    }

    //Take Input
    public static int[] TakeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = s.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    //Print the array
    public static void PrintArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = TakeInput();
        PrintArray(arr);
        System.out.println(findUnique(arr));
    }
}
