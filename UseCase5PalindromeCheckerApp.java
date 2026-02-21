import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */

public class UseCase5PalindromeCheckerApp {
    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded string to check
        String input = "noon";

        // Create a Stack of Characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare each character with the popped character from stack
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display the input
        System.out.println("Input : " + input);

        // Display whether it is a palindrome
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
