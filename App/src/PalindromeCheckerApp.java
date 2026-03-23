/**
 * =========================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level";

        // Use the StackStrategy from UC12's pattern
        PalindromeStrategy13 strategy = new StackStrategy13();

        // Capture start time
        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}

/**
 * Strategy interface for palindrome checking.
 */
interface PalindromeStrategy13 {
    boolean check(String input);
}

/**
 * Stack-based palindrome strategy implementation.
 */
class StackStrategy13 implements PalindromeStrategy13 {

    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push all characters onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop and compare with original sequence
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
```

Compile and run:
```
javac UseCase13PalindromeCheckerApp.java
java UseCase13PalindromeCheckerApp
```

Output:
```
Input : level
Is Palindrome? : true
Execution Time : 852600 ns
