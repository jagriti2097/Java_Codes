/*

You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
Note :
Input arrays/lists can contain duplicate elements.
The intersection elements printed would be in the order they appear in the first array/list(ARR1)

Input format :
First line of each test case or query contains an integer 'N' representing the size of the first array/list.
Second line contains 'N' single space separated integers representing the elements of the first the array/list.
Third line contains an integer 'M' representing the size of the second array/list.
Fourth line contains 'M' single space separated integers representing the elements of the second array/list.

Output format :
Print the intersection elements in a row, separated by a single space.
Output for every test case will be printed in a separate line.
Constraints :
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec
Sample Input 1 :

6
2 6 8 5 4 3
4
2 3 4 7
-------these are two different inputs
2
10 10
1
10
Sample Output 1 :
2 4 3
------
10
Sample Input 2 :
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
2 1 2
Explanation for Sample Output 2 :
Since, both input arrays have two '2's, the intersection of the arrays also have two '2's.
The first '2' of first array matches with the first '2' of the second array.
Similarly, the second '2' of the first array matches with the second '2' if the second array.
 */

package Arrays;

import java.util.Scanner;

public class ArrayIntersection {

    //Intersection
    public static void intersection(int arr1[], int arr2[]){
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] +" ");
                    arr2[j] = -9999; // so that same element doesnt get intersected with arr1 elements
                    break;
                }
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
    public static void PrintArray(int[] arr){
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = TakeInput();
        int[] arr2 = TakeInput();
        System.out.println("Array 1");
        PrintArray(arr1);
        System.out.println("Array 2");
        PrintArray(arr2);
        intersection(arr1,arr2);
    }
}
