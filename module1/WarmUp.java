package yourPackageName; // please update

public class WarmUp {

	/**
     * Problem #1: Implement a method that counts the number of 'r's in a String (CASE INSENTIVE)
     */
    public static int rCount(String str) {
        // TODO: Implement this method
        return 0;
    }
	
	
	/**
     * Problem #2: Return the largest number in an array of integers.
     */
    public static int findLargest(int[] numbers) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Problem #3: Return a new string where all occurrences of 'a' are replaced with 'b' (CASE INSENTIVE)
     */
    public static String replaceChar(String str) {
        // TODO: Implement this method
        return "";
    }

    /**
     * Problem #4: FizzBuzz
     * This method should implement the FizzBuzz game.
     * For numbers 1 to 30:
     * - If the number is divisible by 3, return "Fizz"
     * - If the number is divisible by 5, return "Buzz"
     * - If the number is divisible by both 3 and 5, return "FizzBuzz"
     * - Otherwise, return the number as a string
     * @return String with these FizzBuzz results
     */
    public static String fizzBuzz(int n) {
        // TODO: Implement this method
        return "";
    }

    /**
     * Problem #5
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

    
    
    // RUN TESTS BY RUNNING MAIN METHOD - DON'T CHANGE ANYTHING IN MAIN METHOD THIS WEEK
    public static void main(String[] args) {
        // Test #1: test rCount
    	System.out.println("rCount of 'strawberry' should be 3: " + rCount("strawberry"));
    	System.out.println("rCount of 'Roller coaster' should be 3: " + rCount("Roller coaster"));    	
    	System.out.println("rCount of '' (empty string) should be 0: " + rCount(""));
    	
    	// Test #2 findLargest
        int[] numbers = {1, 5, 3, 7, 2};
        System.out.println("findLargest({1, 5, 3, 7, 2}) should be 7: " + findLargest(numbers));
        
        int[] numbers2 = {-16, -51, -1, -1234123};
        System.out.println("findLargest({-16, -51, -1, -1234123}) should be -1: " + findLargest(numbers2));
        
        int[] number = {500};
        System.out.println("findLargest({500}) should be 500: " + findLargest(number));

        // Test #3 replaceChar
        System.out.println("replaceChar('Java is awesome') should be 'Jbvb is bwesome': " + replaceChar("Java is awesome"));
        
        System.out.println("replaceChar('Grand Adventure') should be 'Grbnd Bdventure': " + replaceChar("Grand Adventure"));

        // Test #4 fizzBuzz
        System.out.println("fizzBuzz(3) should be 'Fizz': " + fizzBuzz(3));
        System.out.println("fizzBuzz(5) should be 'Buzz': " + fizzBuzz(5));
        System.out.println("fizzBuzz(15) should be 'FizzBuzz': " + fizzBuzz(15));
        System.out.println("fizzBuzz(7) should be '7': " + fizzBuzz(7));
        System.out.println("fizzBuzz(1) should be '1': " + fizzBuzz(1));
        System.out.println("fizzBuzz(10) should be 'Buzz': " + fizzBuzz(10));
        System.out.println("fizzBuzz(12) should be 'Fizz': " + fizzBuzz(12));
        System.out.println("fizzBuzz(30) should be 'FizzBuzz': " + fizzBuzz(30));

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
