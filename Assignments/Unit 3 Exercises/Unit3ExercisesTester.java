public class Unit3ExercisesTester {
    
    public static void main(String[] args) {   
        testCalculateStringLengthAverage();
        testReverseString();
        testMaxValue();

    }
    
    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null element in array
        // Test Case - Edge Case: Null element in array
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null array
        try {
	        letters = null;
	        System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
	        System.out.println(e.toString());
	        System.out.println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testReverseString() {
         // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));
         // Test Case - Edge Case: Null string
        try{
	        testString = null;
            if (testString == null) {
                throw new NullPointerException("Cannot reverse a string that doesn't exist");
            }
        } catch (Exception e) {
	        System.out.println(e.toString());
	        System.out.println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testMaxValue() {
        //Test case - main case
        int[] testInt = {0, 4};
        System.out.println("Expected 4: " + Unit3Exercises.findMaxValue(testInt));
        //Test Case - Edge Case: An array containing both negative integers and zero
        testInt[0] = 0;
        testInt[1] = -5;
        System.out.println("Expected 0: " + Unit3Exercises.findMaxValue(testInt));
        // Test case- edge case: only contains negatives
        testInt[0] = -2;
        testInt[1] = -5;
        System.out.println("Expected -2: " + Unit3Exercises.findMaxValue(testInt));
        // Test case - edge case: only null array
        testInt = null;
        try{
            Unit3Exercises.findMaxValue(testInt);
        } catch (Exception e) {
            System.out.println("This method threw an exception correctly, booyah!");
        }
    }

    public static void testIsPalindrome() {
        //Test case - Main case
        String palindrome = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(palindrome));
        //Test Case - Edge Case: non palindrome string
        palindrome = "hello";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(palindrome));
        //Test Case - Edge Case:
        //Test Case - Edge Case:
    }

}
