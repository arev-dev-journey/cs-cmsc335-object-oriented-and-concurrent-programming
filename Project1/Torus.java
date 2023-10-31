
/*
 * file name: Main
 * author: Alex Reveles
 * date: 10/31/2023
 * purpose: Construct a torus with parameters majorRadius and minorRadius
 * Return its volume as a double
 * */
import java.util.Scanner;

public class Torus extends ThreeDimensionalShape {
    private double majorRadius;
    private double minorRadius;

    Scanner scanner = new Scanner(System.in);

    public Torus(double majorRadius, double minorRadius) {
        super(3);
        this.majorRadius = ShapeInputValidator
                .getPositiveInput("You have selected a Torus\nWhat is the major radius? ");
        this.minorRadius = ShapeInputValidator.getPositiveInput("What is the minor radius? ");
    }

    @Override
    public double getVolume() {
        System.out.println(
                "The volume of the Torus is " + (2) * (Math.PI * Math.PI) * majorRadius * (minorRadius * minorRadius));
        return (2) * (Math.PI * Math.PI) * majorRadius * (minorRadius * minorRadius);
    }

}