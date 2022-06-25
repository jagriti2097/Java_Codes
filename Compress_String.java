package Strings;

import java.util.Scanner;

public class Compress_String {

    public static String getCompressedString(String str){
        String FinalStr = "";
        int len = str.length();
        int count = 1;
        for(int i=1;i<len;i++){
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }
            else{

                if(count == 1){
                    FinalStr+=str.charAt(i-1);
                }
                else {
                    FinalStr+= str.charAt(i-1)+""+count;
                    count = 1;
                }
            }
        }
        // if last and second last char are not same then add the last char to string ab
        // aaabbc here a2b2 will be added in for itself, only c would be left. Hence, adding it.
        if(str.charAt(len-1)!= str.charAt(len-2)){
            FinalStr+=str.charAt(len-1);
        }
        // aaa = last char is same then add a and count
        else{
            FinalStr+=str.charAt(len-1)+""+count;
        }

        return FinalStr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = s.nextLine();
        System.out.println(getCompressedString(str));
    }
}
