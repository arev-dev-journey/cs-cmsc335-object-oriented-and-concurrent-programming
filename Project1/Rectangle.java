import java.util.Scanner;

public class Rectangle extends TwoDimensionalShape {
    private double length;
    private double width;

    Scanner scanner = new Scanner(System.in);

    public Rectangle(double length, double width) {
        super(2);
        System.out.println("You have selected a Rectangle\nWhat is the length? ");
        this.length = scanner.nextDouble();
        System.out.println("What is the width? ");
        this.width = scanner.nextDouble();
    }

    @Override
    public double getArea() {
        System.out.println("The area of the Rectangle is " + length * width);
        return length * width;
    }

}