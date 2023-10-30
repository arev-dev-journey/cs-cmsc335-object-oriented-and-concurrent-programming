import java.util.Scanner;

public class Cylinder extends ThreeDimensionalShape {
    private double radius;
    private double height;

    Scanner scanner = new Scanner(System.in);

    public Cylinder(double radius, double height) {
        super(3);
        System.out.println("You have selected a Cylinder\nWhat is the radius? ");
        this.radius = scanner.nextDouble();
        System.out.println("What is the height? ");
        this.height = scanner.nextDouble();
    }

    @Override
    public double getVolume() {
        System.out.println("The volume of the Cylinder is " + Math.PI * (radius * radius) * height);
        return Math.PI * (radius * radius) * height;
    }

}