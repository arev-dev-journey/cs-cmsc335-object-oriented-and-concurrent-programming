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
        System.out.println("The volume of the Sphere is " + (4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}