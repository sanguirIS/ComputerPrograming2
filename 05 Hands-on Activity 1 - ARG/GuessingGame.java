import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for range
        int min, max, guess, randomNumber;
        System.out.print("Enter the minimum value: ");
        min = scanner.nextInt();
        System.out.print("Enter the maximum value: ");
        max = scanner.nextInt();

        // Generate random number
        randomNumber = (int) (Math.random() * (max - min + 1)) + min;

        // Get user guess
        System.out.println("Guess a number between " + min + " and " + max + ": ");
        guess = scanner.nextInt();

        // Check guess
        while (guess != randomNumber) {
            if (guess < min || guess > max) {
                System.out.println("Your guess is out of range. Please try again.");
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
            System.out.print("Enter your guess between " + min + " and " + max + ": ");
            guess = scanner.nextInt();
        }

        // Display result
        System.out.println("Congratulations! You guessed the number correctly.");
    }
}