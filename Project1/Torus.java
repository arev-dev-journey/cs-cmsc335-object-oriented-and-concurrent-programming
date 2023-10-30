import java.util.Scanner;

public class Torus extends ThreeDimensionalShape {
    private double majorRadius;
    private double minorRadius;

    Scanner scanner = new Scanner(System.in);

    public Torus(double majorRadius, double minorRadius) {
        super(3);
        while (true) {
            try {
                System.out.println("You have selected a Torus\nWhat is the major radius? ");
                this.majorRadius = scanner.nextDouble();
                System.out.println("What is the minor radius? ");
                this.minorRadius = scanner.nextDouble();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number");
                scanner.nextLine();
            }
        }
    }

    @Override
    public double getVolume() {
        System.out.println(
                "The volume of the Torus is " + (2) * (Math.PI * Math.PI) * majorRadius * (minorRadius * minorRadius));
        return (2) * (Math.PI * Math.PI) * majorRadius * (minorRadius * minorRadius);
    }

}