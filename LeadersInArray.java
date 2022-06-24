package Arrays;
import java.util.Scanner;
public class LeadersInArray {

    public static void leaders(int[] arr) {
        int n = arr.length;
        for(int i=0; i< n-1;  i++){
            for(int j=i+1;j<n;){
                if(arr[j] > arr[i]){
                    break;
                }
                else {
                    j++;
                    if(j==arr.length){
                        System.out.print(arr[i]+" ");
                    }
                }
            }
        }
        System.out.println(arr[n-1]);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++){
            input[i] = s.nextInt();
        }
        leaders(input);
    }
}
