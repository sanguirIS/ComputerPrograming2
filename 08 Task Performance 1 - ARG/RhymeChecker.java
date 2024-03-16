import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RhymeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine().toLowerCase(); // Convert input to lowercase

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine().toLowerCase(); // Convert input to lowercase

        String sub = word1.substring(word1.length() - 2); // Get the last two letters of word1

        // Regular expression for rhyming pattern (allows 1 or 2 letters before the last two)
        String pattern = "[a-zA-Z]{0,2}" + sub + " ";

        Pattern rhymePattern = Pattern.compile(pattern);
        Matcher matcher = rhymePattern.matcher(word2);

        if (matcher.matches()) {
            System.out.println(word2 + " rhymes with " + word1);
        } else {
            System.out.println("I'm not sure! Sorry!");
        }
    }
}