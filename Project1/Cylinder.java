
/*
 * file name: Cylinder.java
 * author: Alex Reveles
 * date: 10/31/2023
 * purpose: Construct a cylinder with parameters radius and height
 * Return its volume as a double
 * */
import java.util.Scanner;

public class Cylinder extends ThreeDimensionalShape {
    private double radius;
    private double height;

    Scanner scanner = new Scanner(System.in);

    public Cylinder(double radius, double height) {
        super(3);
        this.radius = ShapeInputValidator.getPositiveInput("You have selected a Cylinder\nWhat is the radius? ");
        this.height = ShapeInputValidator.getPositiveInput("What is the height? ");
    }

    @Override
    public double getVolume() {
        System.out.println("The volume of the Cylinder is " + Math.PI * (radius * radius) * height);
        return Math.PI * (radius * radius) * height;
    }

}