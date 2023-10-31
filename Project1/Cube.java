
/*
 * file name: Cube.java
 * author: Alex Reveles
 * date: 10/31/2023
 * purpose: Construct a cube with parameter sideLength
 * Return its volume as a double
 * */
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