
/*
 * file name: Square.java
 * author: Alex Reveles
 * date: 10/31/2023
 * purpose: Construct a square with parameter sideLength
 * Return its area as a double
 * */
import java.util.Scanner;

public class Square extends TwoDimensionalShape {
    private double sideLength;

    Scanner scanner = new Scanner(System.in);

    public Square(double sideLength) {
        super(2);
        this.sideLength = ShapeInputValidator.getPositiveInput("You have selected a Square\nWhat is its length? ");
    }

    @Override
    public double getArea() {
        System.out.println("The area of the Square is " + Math.pow(sideLength, numberOfDimensions));
        return (Math.pow(sideLength, numberOfDimensions));
    }
}