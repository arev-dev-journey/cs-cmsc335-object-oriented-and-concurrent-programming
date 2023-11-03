
/*
 * file name: Sphere.java
 * author: Alex Reveles
 * date: 10/31/2023
 * purpose: Construct a sphere with parameter radius
 * Return its volume as a double
 * */
import java.util.Scanner;

public class Sphere extends ThreeDimensionalShape {
    private double radius;

    Scanner scanner = new Scanner(System.in);

    public Sphere(double radius) {
        super(3);
        this.radius = ShapeInputValidator.getPositiveInput("You have selected a Sphere\nWhat is the radius? ");
    }

    @Override
    public double getVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return Double.parseDouble(String.format("%.2f", volume));
    }
}