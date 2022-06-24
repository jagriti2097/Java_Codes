/*
Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6

Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
 */

package Pattern;

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            for (int j = 1; j <= i; j++) {

                System.out.print(j);
                if(i==j){
                    System.out.print("="+sum);
                }
                else{
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}
