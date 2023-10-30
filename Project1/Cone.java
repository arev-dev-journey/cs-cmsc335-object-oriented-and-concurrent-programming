import java.util.Scanner;

public class Cone extends ThreeDimensionalShape {
    private double radius;
    private double height;

    Scanner scanner = new Scanner(System.in);

    public Cone(double radius, double height) {
        super(3);
        this.radius = ShapeInputValidator.getPositiveInput("You have selected a Cone\nWhat is the radius? ");
        this.height = ShapeInputValidator.getPositiveInput("What is the height? ");
    }

    @Override
    public double getVolume() {
        System.out.println("The volume of the Cone is " + (1 / 3) * (Math.PI * (radius * radius) * height));
        return (1 / 3) * (Math.PI * (radius * radius) * height);
    }

}