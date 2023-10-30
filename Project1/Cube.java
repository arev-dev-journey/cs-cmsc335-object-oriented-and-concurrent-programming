import java.util.Scanner;

public class Cube extends ThreeDimensionalShape {
    private double sideLength;

    Scanner scanner = new Scanner(System.in);

    public Cube(double sideLength) {
        super(3);
        System.out.print("You have selected a Cube\nWhat is its length? ");
        this.sideLength = scanner.nextDouble();
    }

    @Override
    public double getVolume() {
        System.out.println("The area of the Cube is " + Math.pow(sideLength, numberOfDimensions));
        return Math.pow(sideLength, numberOfDimensions);
    }
}