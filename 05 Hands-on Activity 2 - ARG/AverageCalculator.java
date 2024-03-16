import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int count = 0;
        double sum = 0.0;

        // Get user input for 10 numbers
        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            double number = scanner.nextDouble();
            sum += number; // Add the number to the sum
            count++;
        }

        // Calculate and display the average
        double average = sum / 10.0;
        System.out.println("The average of the ten numbers is: " + average);
    }
}