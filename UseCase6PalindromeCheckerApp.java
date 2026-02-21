import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class validates a palindrome using both a Queue
 * and a Stack to demonstrate the behavioral difference
 * between FIFO (First In First Out) and LIFO (Last In
 * First Out) data structures.
 *
 * At this stage, the application:
 * - Pushes characters into a stack (LIFO)
 * - Enqueues characters into a queue (FIFO)
 * - Compares characters from both structures
 * - Displays the result
 *
 * Since a Queue returns characters in original order and
 * a Stack returns them in reverse order, a string is a
 * palindrome if every character removed from the Queue
 * matches the character popped from the Stack.
 *
 * @author Developer
 * @version 6.0
 */

public class UseCase6PalindromeCheckerApp {
    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded string to check
        String input = "civic";

        // Create a Queue and a Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Populate both data structures with characters from the input
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters from Queue (FIFO) and Stack (LIFO)
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
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
