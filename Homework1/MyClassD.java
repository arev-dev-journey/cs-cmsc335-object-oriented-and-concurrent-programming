package Homework1;

public class MyClassD {
    public static void main(String[] args) {
        MyClassC m = new MyClassC(23);
        System.out.println("The value of m = " + m.v);

    } // end main
} // end class MyClassD

class MyClassC {
    int v = 12;

    public MyClassC(int pV) {
        // int v = pV; // cannot declare new local variable v
    }
} // end class MyClassC
