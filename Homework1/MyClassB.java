package Homework1;

public class MyClassB {
    int v = 12;

    public MyClassB(int pV) {
        v = pV;

    }

    public static void main(String[] args) {
        MyClassB m = new MyClassB(23);
        System.out.println("The value of m = " + m.v);
    } // end main
} // end class MyClassB
