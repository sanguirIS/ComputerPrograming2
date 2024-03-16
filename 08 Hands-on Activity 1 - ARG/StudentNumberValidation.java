import java.util.Scanner;

public class StudentNumberValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your student number: ");
        String studentNumber = scanner.nextLine();

        if (isValidStudentNumber(studentNumber)) {
            System.out.println("You have successfully logged in.");
            System.out.println("Welcome to your new dashboard!");
        } else {
            System.out.println("Invalid student number format. Please try again.");
        }
    }

    public static boolean isValidStudentNumber(String studentNumber) {
        // Regular expression for student number format
        String pattern = "^\\d{4}-\\d{2}-\\d{3}$";

        return studentNumber.matches(pattern);
    }
}