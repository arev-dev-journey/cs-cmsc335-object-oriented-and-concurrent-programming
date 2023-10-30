import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ShapeMenu {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        while (true)

        {

            System.out.println("********Welcome to the Java OO Shapes Program********\n"
                    + "Select from the menu below:\n1. Construct a Circle\n2. Construct a Rectangle\n3. Construct a Square\n"
                    +
                    "4. Construct a Triangle\n5. Construct a Sphere\n6. Construct a Cube\n7. Construct a Cone\n8. Construct a Cylinder\n"
                    +
                    "9. Construct a Torus\n10. Exit the Program");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 10) {
                Date currentDate = new Date();
                Date currentTime = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd");
                SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("hh:mm a");
                String formattedDate = simpleDateFormat.format(currentDate);
                String formattedTime = simpleTimeFormat.format(currentTime);
                System.out
                        .println("Thank you for using the program! Today is " + formattedDate + " at " + formattedTime);
                break;
            }

            switch (choice) {
                case 1:
                    double radius = 0.0;
                    Circle circle = new Circle(radius);
                    circle.getArea();
                    break;
                case 2:
                    double length = 0.0;
                    double width = 0.0;
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangle.getArea();
                    break;
                case 3:
                    double sideLength = 0.0;
                    Square square = new Square(sideLength);
                    square.getArea();
                    break;
                case 4:
                    double base = 0.0;
                    double height = 0.0;
                    Triangle triangle = new Triangle(base, height);
                    triangle.getArea();
                    break;
                // Add cases for other shapes here
                case 5:
                    radius = 0.0;
                    Sphere sphere = new Sphere(radius);
                    sphere.getVolume();
                    break;
                case 6:
                    sideLength = 0.0;
                    Cube cube = new Cube(sideLength);
                    cube.getVolume();
                    break;
                case 7:
                    radius = 0.0;
                    height = 0.0;
                    Cone cone = new Cone(radius, height);
                    cone.getVolume();
                    break;
                case 8:
                    radius = 0.0;
                    height = 0.0;
                    Cylinder cylinder = new Cylinder(radius, height);
                    cylinder.getVolume();
                    break;
                case 9:
                    double majorRadius = 0.0;
                    double minorRadius = 0.0;
                    Torus torus = new Torus(majorRadius, minorRadius);
                    torus.getVolume();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
        scanner.close();

    }

}
