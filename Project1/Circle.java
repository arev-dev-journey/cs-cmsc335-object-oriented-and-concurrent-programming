
/*
 * file name: Circle.java
 * author: Alex Reveles
 * date: 10/31/2023
 * purpose: Construct a circle with parameter radius
 * Return its area as a double
 * */
import java.util.Scanner;

public class Circle extends TwoDimensionalShape {
    private double radius;

    Scanner scanner = new Scanner(System.in);

    public Circle(double radius) {
        super(2);
        this.radius = ShapeInputValidator.getPositiveInput("You have selected a Circle\nWhat is the radius? ");
    }

    @Override
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return Double.parseDouble(String.format("%.2f", area));
    }
}