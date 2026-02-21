import java.util.Deque;
import java.util.ArrayDeque;

/**
 * =========================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue) for optimal bidirectional traversal.
 *
 * At this stage, the application:
 * - Stores characters into a Deque
 * - Compares front and rear elements simultaneously
 * - Determines whether the string is a palindrome
 * - Displays the result
 *
 * This approach eliminates the need for separate reversal
 * data structures, providing clean bidirectional traversal
 * using removeFirst() and removeLast().
 *
 * @author Developer
 * @version 7.0
 */

public class UseCase7PalindromeCheckerApp {
    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded string to check
        String input = "refer";

        // Create a Deque (Double Ended Queue)
        Deque<Character> deque = new ArrayDeque<>();

        // Store characters of the input string into the Deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare front and rear elements until Deque has 1 or 0 elements
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) {
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
