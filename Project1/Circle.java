import java.util.Scanner;

public class Circle extends TwoDimensionalShape {
    private double radius;

    Scanner scanner = new Scanner(System.in);

    public Circle(double radius) {
        super(2);
        System.out.print("You have selected a Circle\nWhat is the radius? ");
        this.radius = scanner.nextDouble();

    }

    @Override
    public double getArea() {
        System.out.println("The area of the Circle is " + (Math.PI * (radius * radius)));
        return Math.PI * (radius * radius);
    }
}