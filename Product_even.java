package Basics;

public class Product_even {
    public static void main(String[] args) {
        int i = 2;
        double product = 1;
        while(i<=100){
//            System.out.println(i+" "+ product);
            product*=i;
            i+=2;

        }
        System.out.println(product%(long)1000000007);
    }
}
