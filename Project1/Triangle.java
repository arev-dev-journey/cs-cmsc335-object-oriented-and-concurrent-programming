import java.util.Scanner;

public class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;

    Scanner scanner = new Scanner(System.in);

    public Triangle(double base, double height) {
        super(2);

        int choice;

        while (true) {
            System.out.println("You have selected a Triangle\nWhich triangle would you like to construct? ");
            System.out.println("1.Equilateral\n2.Isosceles\n3.Right");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("Invalid input. Please select from one of the options");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number");
                scanner.nextLine();
            }
        }
        switch (choice) {
            case 1:
                this.base = ShapeInputValidator.getPositiveInput("You have selected Equilateral. What is its length? ");
                this.height = ShapeInputValidator.getPositiveInput("What is the height? ");
                break;
            case 2:
                this.base = ShapeInputValidator.getPositiveInput("You have selected Isosceles. What is the base?  ");
                this.height = ShapeInputValidator.getPositiveInput("What is the height? ");
                break;
            case 3:
                this.base = ShapeInputValidator.getPositiveInput("You have selected Right. What is the base? ");
                this.height = ShapeInputValidator.getPositiveInput("What is the height? ");
                break;
        }
    }

    @Override
    public double getArea() {
        System.out.println("The area of the Triangle is " + (0.5 * (base * height)));
        return 0.5 * (base * height);
    }
}