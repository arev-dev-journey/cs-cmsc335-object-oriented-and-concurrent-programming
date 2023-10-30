import java.util.Scanner;

public class Cube extends ThreeDimensionalShape {
    private double sideLength;

    Scanner scanner = new Scanner(System.in);

    public Cube(double sideLength) {
        super(3);
        this.sideLength = ShapeInputValidator.getPositiveInput("You have selected a Cube\nWhat is its length? ");
    }

    @Override
    public double getVolume() {
        System.out.println("The volume of the Cube is " + Math.pow(sideLength, numberOfDimensions));
        return Math.pow(sideLength, numberOfDimensions);
    }
}