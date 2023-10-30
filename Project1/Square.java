import java.util.Scanner;

public class Square extends TwoDimensionalShape {
    private double sideLength;

    Scanner scanner = new Scanner(System.in);

    public Square(double sideLength) {
        super(2);
        while (true) {
            try {
                System.out.print("You have selected a Square\nWhat is its length? ");
                this.sideLength = scanner.nextDouble();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number");
                scanner.nextLine();
            }
        }
    }

    @Override
    public double getArea() {
        System.out.println("The area of the Square is " + Math.pow(sideLength, numberOfDimensions));
        return (Math.pow(sideLength, numberOfDimensions));
    }
}