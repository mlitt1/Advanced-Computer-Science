public class Tester {

    
    public static void main(String[] args) {
        testMatchingEndsequence();
        testHasThreeConsecutive();
        testGenerateNumberSequence();
        testFizzBuzz();
    }

    public static void testMatchingEndsequence() {
        int[] nums = {5, 6, 4, 19, 29, 5, 6};
        try {
            Unit4Exercises.matchingEndSequences(nums, 0);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Unit4Exercises.matchingEndSequences(nums, -2);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Unit4Exercises.matchingEndSequences(nums, 10);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        int[] numbers = {5, 6, 4, 19, 29, 5, 6};
        System.out.println(Unit4Exercises.matchingEndSequences(numbers, 1));
        System.out.println(Unit4Exercises.matchingEndSequences(numbers, 2));
        System.out.println(Unit4Exercises.matchingEndSequences(numbers, 3));
    }
    
    public static void testHasThreeConsecutive() {
        int[] numbers = {1, 2};
        try {
            Unit4Exercises.hasThreeConsecutive(numbers);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Unit4Exercises.hasThreeConsecutive(null);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testGenerateNumberSequence() {
        try {
            Unit4Exercises.generateNumberSequence(9, 5);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testFizzBuzz() {
        System.out.println(Unit4Exercises.fizzBuzz(1, 17));
    }

    public static void testMoveEvenBeforeOdd() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        Unit4Exercises.moveEvenBeforeOdd(nums);
        System.out.println(Utils.printIntArray(nums));
    }



}
