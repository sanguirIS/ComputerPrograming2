package labexer1a;

// Import the Scanner class to read user input
import java.util.Scanner;

public class LabExer1A {

    public static void main(String[] args) {

        // Declare variables
        int faveNumber;
        String faveCartChar;
        char mi;
        char[] nickNameArray;

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("What is your favorite number? ");
        faveNumber = scanner.nextInt();

        System.out.print("Who is your favorite cartoon or anime character? ");
        faveCartChar = scanner.next();

        System.out.print("What is your middle initial? ");
        mi = scanner.next().charAt(0);

        System.out.print("What is your nickname? ");
        nickNameArray = scanner.next().toCharArray();

        // Output the information
        System.out.println(faveNumber + " is my favorite number.");
        System.out.println("I love " + faveCartChar + "!");
        System.out.println("My name is <Your First Name> " + mi + " <Your Last Name>"); // Replace with your actual first and last name
        System.out.print("You can call me ");
        for (char letter : nickNameArray) {
            System.out.print(letter);
        }
        System.out.println(".");

    }
}