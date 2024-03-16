package labexer1b;

import java.util.Scanner;

public class LabExer1B {

    public static void main(String[] args) {
        // Declare and initialize a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Call the methods to display the number + 10, 100, and 1000
        showNumberPlus10(number);
        showNumberPlus100(number);
        showNumberPlus1000(number);
    }

    public static void showNumberPlus10(int number) {
        System.out.println(number + " plus 10 is " + (number + 10));
    }

    public static void showNumberPlus100(int number) {
        System.out.println(number + " plus 100 is " + (number + 100));
    }

    public static void showNumberPlus1000(int number) {
        System.out.println(number + " plus 1000 is " + (number + 1000));
    }
}