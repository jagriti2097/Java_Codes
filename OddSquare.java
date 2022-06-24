/*

13579
35791
57913
79135
91357

 */
package Pattern;
import java.util.Scanner;
public class OddSquare {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int num = s.nextInt();

            for (int i =1 ;i<=num;i++)
            {
                int k = 2*i-1;
                for (int j=1;j<=num;j++)
                {

                    System.out.print(k);
                    k+=2;

                    if (k>2*num-1)
                    {
                        k=1;
                    }
                }

                System.out.println();
            }
        }
}
