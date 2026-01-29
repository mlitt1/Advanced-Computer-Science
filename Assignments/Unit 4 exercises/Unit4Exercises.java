import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        if (nums == null) {
            throw new NullPointerException("Array is empty");
        }
        if (n > nums.length || n < 0) {
            throw new IllegalArgumentException("Number is out of bounds");
        }
        if (nums[n] == nums[0] && nums[n + 1] == nums[1]) {
            return true;
        }
        return false;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0; 
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        if (nums == null) {
            throw new NullPointerException("Array is null");
        }
        for (int i = 0; i < nums.length; i++) {
            if (isOdd(nums[i]) && isOdd(nums[i + 1]) && isOdd(nums[i + 2])) {
                return true;
            } else if (!isOdd(nums[i]) && !isOdd(nums[i + 1]) && !isOdd(nums[i + 2])) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start number can't be bigger than end number");
        }
        int[] array = new int[end - start];
        int count = start;
        for (int i = 0; i < array.length; i++) {
            array[i] += count;
            count++;
        }
        return new int[0];
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start number can't be bigger than end number");
        }
        String[] array = new String[end - start];
        int count = start;
        for (int i = 0; i < array.length; i++) {
            array[i] = count + "";
            count++;
        }
        for (int index = 0; index < array.length; index++) {
            if (Integer.parseInt(array[index]) % 5 == 0 && Integer.parseInt(array[index]) % 3 == 0) {
                array[index] = "FizzBuzz";
            } else if (Integer.parseInt(array[index]) % 3 == 0) {
                array[index] = "Fizz";
            } else {
                if (Integer.parseInt(array[index]) % 5 == 0) {
                    array[index] = "Buzz";
                }
            }
            
        }
        
        return new String[0];
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int countEven = 0;
        int countOdd = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        int[] evenArray = new int[countEven];
        int[] oddArray = new int[countOdd];
        int countEvens = 0;
        int countOdds = 0;
        for (int i = 0; i < evenArray.length; i++) {
            if (nums[i] % 2 == 0) {
                evenArray[countEvens] = nums[i];
                countEvens++;
            } else {
                oddArray[countOdds] = nums[i];
                countOdds++;
            }
        }
        for (int i = 0; i < evenArray.length; i++) {
            nums[i] = evenArray[i];
        }
        for (int i = 0; i < oddArray.length; i++) {
            nums[i + evenArray.length] = oddArray[i];
        }
        // to-do: implement the method
        return nums;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}
