package yourPackageNameHere;

public class WarmUp {

    /**
     * This method should return the largest number in an array of integers.
     */
    public static int findLargest(int[] numbers) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * This method should return a new string where all occurrences of 'a' are replaced with 'b'.
     */
    public static String replaceChar(String str) {
        // TODO: Implement this method
        return "";
    }

    /**
     * This method should implement the FizzBuzz game.
     * For numbers 1 to n:
     * - If the number is divisible by 3, return "Fizz"
     * - If the number is divisible by 5, return "Buzz"
     * - If the number is divisible by both 3 and 5, return "FizzBuzz"
     * - Otherwise, return the number as a string
     * @param n the number to FizzBuzz up to
     * @return an array of strings with the FizzBuzz results
     */
    public static String[] fizzBuzz(int n) {
        // TODO: Implement this method
        return new String[n];
    }

    /**
     * This method should calculate the Hamming distance between two strings.
     * The Hamming distance is the number of positions at which the corresponding
     * characters in two strings are different. For example, "ABC" and "ABX" should return 1
     * @return the Hamming distance between s1 and s2
     * @throws IllegalArgumentException if the strings have different lengths
     */
    public static int hammingDistance(String s1, String s2) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        // Test findLargest
        int[] numbers = {1, 5, 3, 7, 2};
        System.out.println("findLargest({1, 5, 3, 7, 2}) should be 7: " + findLargest(numbers));

        // Test replaceChar
        System.out.println("replaceChar('Java is awesome') should be 'Jbvb is bwesome': " + replaceChar("Java is awesome"));

        // Test fizzBuzz
        String[] fizzBuzzResult = fizzBuzz(15);
        System.out.println("FizzBuzz up to 15:");
        for (int i = 0; i < fizzBuzzResult.length; i++) {
            System.out.println((i + 1) + ": " + fizzBuzzResult[i]);
        }

        // Test hammingDistance
        try {
            System.out.println("hammingDistance('karolin', 'kathrin') should be 3: " + hammingDistance("karolin", "kathrin"));
            System.out.println("hammingDistance('karolin', 'kerstin') should be 3: " + hammingDistance("karolin", "kerstin"));
            hammingDistance("1011101", "1001001");
            System.out.println("Test case passed: No exception thrown for equal length strings.");
        } catch (IllegalArgumentException e) {
            System.out.println("Test case failed: Exception thrown for equal length strings.");
        }

        try {
            hammingDistance("short", "longer");
            System.out.println("Test case failed: No exception thrown for different length strings.");
        } catch (IllegalArgumentException e) {
            System.out.println("Test case passed: Exception thrown for different length strings.");
        }
    }
}
