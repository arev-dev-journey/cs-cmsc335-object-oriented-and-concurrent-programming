
/*
 * file name: ShapeMenu.java
 * author: Alex Reveles
 * date: 10/31/2023
 * purpose: Main driver program running ShapeMenu
 * */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ShapeMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        while (true) {

            System.out.println("********Welcome to the Java OO Shapes Program********\n"
                    + "Select from the menu below:\n1. Construct a Circle\n2. Construct a Rectangle\n3. Construct a Square\n"
                    +
                    "4. Construct a Triangle\n5. Construct a Sphere\n6. Construct a Cube\n7. Construct a Cone\n8. Construct a Cylinder\n"
                    +
                    "9. Construct a Torus\n10. Exit the Program");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number");
                scanner.nextLine();
                continue;
            }

            if (choice == 10) {
                displayExitMessage();
                break;
            }

            processShape(choice);
            if (!promptToContinue()) {
                displayExitMessage();
                break;
            }
        }
    }

    private static void processShape(int choice) {

        switch (choice) {
            case 1:
                double radius = 0.0;
                Circle circle = new Circle(radius);
                System.out.println("The area of the Circle is " + circle.getArea());
                break;
            case 2:
                double length = 0.0;
                double width = 0.0;
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("The area of the Rectangle is " + rectangle.getArea());
                break;
            case 3:
                double sideLength = 0.0;
                Square square = new Square(sideLength);
                System.out.println("The area of the Square is " + square.getArea());
                break;
            case 4:
                double base = 0.0;
                double height = 0.0;
                Triangle triangle = new Triangle(base, height);
                System.out.println("The area of the Triangle is " + triangle.getArea());
                break;
            case 5:
                radius = 0.0;
                Sphere sphere = new Sphere(radius);
                System.out.println("The volume of the Sphere is " + sphere.getVolume());
                break;
            case 6:
                sideLength = 0.0;
                Cube cube = new Cube(sideLength);
                System.out.println("The volume of the Cube is " + cube.getVolume());
                break;
            case 7:
                radius = 0.0;
                height = 0.0;
                Cone cone = new Cone(radius, height);
                System.out.println("The volume of the Cone is " + cone.getVolume());
                break;
            case 8:
                radius = 0.0;
                height = 0.0;
                Cylinder cylinder = new Cylinder(radius, height);
                System.out.println("The volume of the Cylinder is " + cylinder.getVolume());
                break;
            case 9:
                double majorRadius = 0.0;
                double minorRadius = 0.0;
                Torus torus = new Torus(majorRadius, minorRadius);
                System.out.println("The volume of the Torus is " + torus.getVolume());
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

    }

    private static boolean promptToContinue() {
        while (true) {
            System.out.println("Would you like to continue? (Y or N)");
            String choice = scanner.next().toLowerCase(); // Convert to lowercase for case-insensitive comparison
            if (choice.equals("y")) {
                return true;
            } else if (choice.equals("n")) {
                return false;
            } else {
                System.out.println("Sorry, I do not understand. Enter Y or N");
            }
        }
    }

    private static void displayExitMessage() {
        Date currentDate = new Date();
        Date currentTime = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd");
        SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("hh:mm a");
        String formattedDate = simpleDateFormat.format(currentDate);
        String formattedTime = simpleTimeFormat.format(currentTime);
        System.out
                .println("Thank you for using the program! Today is " + formattedDate + " at " + formattedTime);

    }

    public static void closeScanner() {
        scanner.close();
    }
}
