package Arrays;

public class Dynamic_Array_main {

    public static void main(String[] args) {

        Dynamic_Array d = new Dynamic_Array();

        for(int i=1;i<100;i++){
            d.add(100+i);
        }
        System.out.println(d.size());
        System.out.println(d.get(2));
        d.set(2,170);
        System.out.println(d.get(2));

//        while(!d.isEmpty()){
//            System.out.println(d.removeLast());
//            System.out.println("Size - " + d.size());
//        }
    }
}
