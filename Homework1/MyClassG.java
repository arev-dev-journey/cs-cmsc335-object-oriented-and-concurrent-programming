package Homework1;

public class MyClassG {
    public static void main(String[] args) {
        MyClassH m = new MyClassH(23, true);
        System.out.println("The value of m = " + m.v);
    } // end main
} // end MyClassG

class MyClassH {
    int v = 12;

    public MyClassH(int x, boolean b) {
        this(x);
    }

    private MyClassH(int pV) {
        v = pV;
    }
} // end class MyClassH