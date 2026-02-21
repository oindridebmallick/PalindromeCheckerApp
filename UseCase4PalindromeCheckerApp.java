/**
 * =========================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * a character array and the two-pointer technique.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Converts it to a character array
 * - Uses two pointers (start and end) to compare characters
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces an efficient comparison approach
 * that reduces extra memory usage by avoiding string
 * concatenation or multiple string objects.
 *
 * @author Developer
 * @version 4.0
 */

public class UseCase4PalindromeCheckerApp {
    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded string to check
        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning.
        int start = 0;

        // Initialize pointer at the end.
        int end = chars.length - 1;

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Continue comparison until pointers cross.
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display the input
        System.out.println("Input : " + input);

        // Display whether it is a palindrome
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
