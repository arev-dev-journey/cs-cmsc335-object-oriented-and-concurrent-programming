import java.util.Scanner;

public class Cube extends ThreeDimensionalShape {
    private double sideLength;

    Scanner scanner = new Scanner(System.in);

    public Cube(double sideLength) {
        super(3);
        while (true) {
            try {
                System.out.print("You have selected a Cube\nWhat is its length? ");
                this.sideLength = scanner.nextDouble();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number");
                scanner.nextLine();

            }
        }
    }

    @Override
    public double getVolume() {
        System.out.println("The volume of the Cube is " + Math.pow(sideLength, numberOfDimensions));
        return Math.pow(sideLength, numberOfDimensions);
    }
}