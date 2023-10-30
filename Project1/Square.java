import java.util.Scanner;

public class Square extends TwoDimensionalShape {
    private double sideLength;

    Scanner scanner = new Scanner(System.in);

    public Square(double sideLength) {
        super(2);
        System.out.print("You have selected a Square\nWhat is its length? ");
        this.sideLength = scanner.nextDouble();
    }

    @Override
    public double getArea() {
        System.out.println("The area of the Square is " + Math.pow(sideLength, numberOfDimensions));
        return (Math.pow(sideLength, numberOfDimensions));
    }
}