
/*
 * file name: Rectangle.java
 * author: Alex Reveles
 * date: 10/31/2023
 * purpose: Construct a rectangle with
 * parameters length and width. Return its area as a double
 * */
import java.util.Scanner;

public class Rectangle extends TwoDimensionalShape {
    private double length;
    private double width;

    Scanner scanner = new Scanner(System.in);

    public Rectangle(double length, double width) {
        super(2);

        this.length = ShapeInputValidator.getPositiveInput("You have selected a Rectangle\nWhat is the length? ");
        this.width = ShapeInputValidator.getPositiveInput("What is the width? ");
    }

    @Override
    public double getArea() {
        System.out.println("The area of the Rectangle is " + length * width);
        return length * width;
    }

}