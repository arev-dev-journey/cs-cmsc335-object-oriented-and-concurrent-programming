import java.util.Scanner;

public class Cone extends ThreeDimensionalShape {
    private double radius;
    private double height;

    Scanner scanner = new Scanner(System.in);

    public Cone(double radius, double height) {
        super(3);
        System.out.println("You have selected a Cone\nWhat is the radius? ");
        this.radius = scanner.nextDouble();
        System.out.println("What is the height? ");
        this.height = scanner.nextDouble();
    }

    @Override
    public double getVolume() {
        System.out.println("The volume of the Cone is " + (1 / 3) * (Math.PI * (radius * radius) * height));
        return (1 / 3) * (Math.PI * (radius * radius) * height);
    }

}