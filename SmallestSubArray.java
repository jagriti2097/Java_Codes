/*
Given an array 'A' consisting of 'N' integers, find the smallest subarray of 'A' containing exactly 'K' distinct integers.
Note :
If more than one such contiguous subarrays exist, consider the subarray having the smallest leftmost index.

For example - if A is [1, 2, 2, 3, 1, 3 ] and k = 2 then the subarrays: [1,2], [2,3], [3,1], [1,3] are the smallest subarrays containing 2 distinct elements. In this case, we will consider the starting and ending index of subarray [1,2] i.e. 0 and 1.
Input Format :
The first line contains two integers 'N' and 'K' denoting the total number of integers and number of distinct integers respectively.

The second line contains 'N' space-separated integers describing elements of the array 'A'.
Output Format :
Print two space-separated integers denoting the starting and ending index of the subarray if it exists, otherwise print -1.
Note :
You do not need to print anything, it has already been taken care of. Just implement the given function.
Assume array starts with 0 index.
If more than one solution is possible then print the subarray with smaller left index.
Constraints :
1 <= N, K <= 10^6
-10^5 <= A[i] <= 10^5

Time limit: 1 sec
Sample Input 1 :
4 3
1 1 2 1 2
Sample Output 1 :
-1
Explanation Of Sample Input 1 :
The value of k = 3 and there are only two distinct elements in the given array i.e 2 and 3. Therefore there exist no subarray with 3 distinct elements.
Sample Input 2 :
8 3
4 2 2 2 3 4 4 3
Sample Output 2 :
3 5
 */
package Arrays;

import java.util.Scanner;

public class SmallestSubArray {

    public static void smallestSubArray(int[] arr, int k) {
        int[] temp = new int[k];

        for (int i = 0; i < arr.length-k+1;i++) {
            int tempIndex = 0;
            temp[tempIndex] = arr[i];
            for (int j = i + 1; j < i+k; j++) {
                if (arr[j] != temp[tempIndex]) {
                    tempIndex++;
                    temp[tempIndex] = arr[j];
                    if(tempIndex == k){
                        System.out.println(i+" "+i+k);
                        return;
                    }
                }
                else {
                    break;
                }
            }
            System.out.println();
            Basic.PrintArray(temp);

        }
    }

    public static void main(String[] args) {
        int[] arr = Basic.Takeinput();
//        System.out.println();
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        Basic.PrintArray(arr);

        smallestSubArray(arr,k);
    }
}

