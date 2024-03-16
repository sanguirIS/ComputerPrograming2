import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double base, height, area;

        // Get user input for base and height
        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();

        // Calculate area
        area = 0.5 * base * height;

        // Display area
        System.out.println("The area of the triangle is: " + area);
    }
}