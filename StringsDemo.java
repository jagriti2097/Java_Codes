package Strings;

public class StringsDemo {

    public static void main(String[] args) {
        First f1 = new First(10,"A");
        System.out.println(f1);
        System.out.println(f1.toString());

        Second s1 = new Second(10,"A");
        System.out.println(s1);
        System.out.println(s1.toString());

        String s2 = "This is demo class";
        System.out.println(s2.subSequence(3,11));
        System.out.println(s2.substring(3,11));

    }
}

class First{
    int i;
    String name;

    public First(int i, String name) {
        this.i = i;
        this.name = name;
    }
}

class Second{
    int i;
    String name;

    public Second(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public String toString(){
        return this.name + " " + this.i;
    }
}