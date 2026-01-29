public class Unit3PracticeTester {
    
    public static void main(String[] args) {
        testParsePositiveInt();
        testGetArrayElement();
        testCalculateSquareRoot();
        testSumArrayElements();
        testCalculatePower();
    }

    public static void testParsePositiveInt() {
        // test case - is negative
        String poString = "-5";
        try {
            Unit3Practice.parsePositiveInteger(poString);
        } catch (Exception e) {
            System.out.println(e);
        }
        // test case- is 0
        String poString2 = "0";
        try {
            Unit3Practice.parsePositiveInteger(poString2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testGetArrayElement() {
        // test case- check out of bounds
        String[] arr = {"a", "b", "c", "c"};
        int index = 5;
        try {
            Unit3Practice.getArrayElement(arr, index);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void testCalculateSquareRoot() {
        // test case - check for negative numbers
        int number = -1;
        try {
            Unit3Practice.calculateSquareRoot(number);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testSumArrayElements() {
        // test case- check for null
        int[] arr = null;
        try {
            Unit3Practice.sumArrayElements(arr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testCalculatePower() {
        //test case - base can't be negative
        int base = -67;
        int exponent = 2;
        try {
            Unit3Practice.calculatePower(base, exponent);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
