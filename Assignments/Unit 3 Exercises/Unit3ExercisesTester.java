public class Unit3ExercisesTester {
    
    public static void main(String[] args) {   
        testCalculateStringLengthAverage();
        testReverseString();
        testMaxValue();
        testIsPalindrome();
        testSumEvenInts();
        testCalculateSumOfSquares();
        testGetNthFibonacci();
        testSortArrayDecsending();
        testLongestWord();
        testCalculateInterest();
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
	        System.out.println(e);
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
	        System.out.println(e);
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
            System.out.println(e);
        }
    }

    public static void testIsPalindrome() {
        //Test case - Main case
        String str = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(str));
        //Test Case - Edge Case: non palindrome string
        str = "hello";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(str));
        //Test Case - Edge Case: null string
        str = null;
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(str));
        //Test Case - Edge Case: empy string
        str = " ";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(str));
    }

    public static void testSumEvenInts() {
        //Test case - Main case: Test with an array containing positive even and odd integers;
        int[] numbers = {1, 2, 3, 4};
        System.out.println("Expected 6: " + Unit3Exercises.sumEvenNumbers(numbers));
        //Test Case - Edge Case: Test with an array containing only negative even and odd integers
        int[] numbers1 = {-1, 1, 3, 5};
        System.out.println("Expected 0: " + Unit3Exercises.sumEvenNumbers(numbers1));
        //Test Case - Edge Case: Test with an array containing both positive and negative even and odd integers
        int[] numbers2 = {-1, 2, 3, 4};
        System.out.println("Expected 6: " + Unit3Exercises.sumEvenNumbers(numbers2));
        //Test Case - Edge Case: Test with a null array.
        int[] numbers3 = null;
        try{
            Unit3Exercises.sumEvenNumbers(numbers3);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public static void testCalculateSumOfSquares() {
        // Test case - main case
        int[] numbers = {1, 2, 3, 4};
        System.out.println("Expected 30: " + Unit3Exercises.calculateSumOfSquares(numbers));
        // edge case- null
        numbers = null;
        try{
            Unit3Exercises.calculateSumOfSquares(numbers);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testGetNthFibonacci() {
        // Test case - main case
        int n = 9;
        System.out.println("Expected 34: " + Unit3Exercises.getNthFibonacci(n));
        // test case- negative number
        n = -2;
        try{
            Unit3Exercises.getNthFibonacci(n);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testSortArrayDecsending() {
        // Test case - main case
        int[] array = {1, 3, 2 , 0};
        System.out.println("Expected 0, 1, 2, 3: ");
        Unit3Exercises.sortArrayDescending(array);
        // Test case - main case: negative values
        int[] array2 = {-1, 2, -3, 0};
        System.out.println("Expected -3, -1, 0, 2: ");
        Unit3Exercises.sortArrayDescending(array2);
        // Edge case - null array
        int[] array3 = null;
        try{
            Unit3Exercises.sortArrayDescending(array3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testLongestWord() {
        // Test case - main case test with two sentances
        String sentance1 = "This sentance is long";
        System.out.println("Expected sentance: " + Unit3Exercises.findLongestWord(sentance1));
        // Test case- main case when multiple words have the same longest length, the method returns the first occurrence.
        String sentance2 = "This sentance is reaaaaly long";
        System.out.println("Expected sentance: " + Unit3Exercises.findLongestWord(sentance2));
        // Edge case- Handle null or empty input by throwing an appropriate exception with a descriptive message.
        String sentance3 = null;
        try {
            Unit3Exercises.findLongestWord(sentance3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void testCalculateInterest() {
        //test case- Main Case - Choose appropriate parameters, manually calculate the expected value, and verify that the code produces the correct output. Test with at least 2 different sets of values.
        double principle = 100;
        double rate = 10;
        int years = 2;
        System.out.println("Expected 121: " + Unit3Exercises.calculateInterest(principle, rate, years));
        // edge case - Edge Case - The principal amount cannot be negative.
        double principle2 = -100;
        double rate2 = 10;
        int years2 = 2;
        try {
            Unit3Exercises.calculateInterest(principle2, rate2, years2);
        } catch (Exception e) {
            System.out.println(e);
        }
        // edge case - Edge Case - The rate amount cannot be negative.
        double principle3 = 100;
        double rate3 = -10;
        int years3 = 2;
        try {
            Unit3Exercises.calculateInterest(principle3, rate3, years3);
        } catch (Exception e) {
            System.out.println(e);
        }
        // edge case - Edge Case - The years amount cannot be negative.
        double principle4 = 100;
        double rate4 = 10;
        int years4 = -2;
        try {
            Unit3Exercises.calculateInterest(principle4, rate4, years4);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

}
