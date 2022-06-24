/*
    Write a program to input a name(as a single character) and marks of three tests as m1, m2, and m3 of a student
    considering all the three marks have been given in integer format.
Now, you need to calculate the average of the given marks and print it along with the name as mentioned in the output format section.
All the test marks are in integers and hence calculate the average in integer as well.
That is, you need to print the integer part of the average only and neglect the decimal part.

Sample Input 1 :
A
3 4 6

Sample Output 1 :
A
4
 */
package Basics;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        String ch = s.next();
        //char ch = s.charAt(0);
        System.out.println("Enter the Marks : ");
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();

        System.out.println(ch);
        System.out.println((m1+m2+m3)/3);
    }
}

