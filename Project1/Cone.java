
/*
 * file name: Cone.java
 * author: Alex Reveles
 * date: 10/31/2023
 * purpose: Construct a cone with parameters radius and height
 * Return its volume as a double
 * */
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
        double volume = (1.0 / 3.0) * (Math.PI * (radius * radius) * height);
        return Double.parseDouble(String.format("%.2f", volume));
    }

}