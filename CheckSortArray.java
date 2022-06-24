package Arrays;

public class CheckSortArray {

    public static void check(int[] arr){
        for(int i=0;i<arr.length-1;i++){
           if(arr[i+1] < arr[i]){
               System.out.println(false);
               return;
           }
        }
        System.out.println(true);
    }

    public static void main(String[] args) {
        int[] arr = Basic.Takeinput();
        Basic.PrintArray(arr);
        check(arr);
    }
}
