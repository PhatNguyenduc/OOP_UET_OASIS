// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * Calculates the nth Fibonacci number.
     *
     * @param n The index of the Fibonacci number to calculate.
     * @return The nth Fibonacci number, or -1 if n is negative.
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long prev = 0;
            long current = 1;
            long result = 0;

            for (int i = 2; i <= n; i++) {
            // Check for overflow
            if (prev / 2 + current / 2 > Long.MAX_VALUE / 2) {
                return Long.MAX_VALUE;
            }
            result = prev + current;
            prev = current;
            current = result;
        }

        return result;
    }
}

} 