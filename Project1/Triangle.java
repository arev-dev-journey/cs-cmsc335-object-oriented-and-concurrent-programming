import java.util.Scanner;

public class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;

    Scanner scanner = new Scanner(System.in);

    public Triangle(double base, double height) {
        super(2);
        System.out.println("You have selected a Triangle\nWhat is the base? ");
        this.base = scanner.nextDouble();
        System.out.println("What is the height? ");
        this.height = scanner.nextDouble();
    }

    @Override
    public double getArea() {
        System.out.println("The area of the Triangle is " + (1.5 * (base / height)));
        return 1.5 * (base / height);
    }
}