/**
 * =========================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This class demonstrates palindrome validation using
 * a transformation-based approach — reversing the string
 * and comparing it with the original.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Reverses the string using a loop
 * - Compares the original and reversed strings
 * - Displays the result on the console
 *
 * This use case introduces transformation-based validation
 * logic before using advanced data structures.
 *
 * @author Developer
 * @version 3.0
 */

public class UseCase3PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded string to check
        String input = "madam";

        // Variable to store the reversed string
        String reversed = "";

        // Reverse the string by iterating from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Compare original and reversed strings using equals()
        boolean isPalindrome = input.equals(reversed);

        // Display the input text
        System.out.println("Input text : " + input);

        // Display the reversed text
        System.out.println("Reversed text : " + reversed);

        // Display whether it is a palindrome
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
