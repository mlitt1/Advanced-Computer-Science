import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        if (nums == null) {
            throw new NullPointerException("Array is null");
        }
        if (n < 0 || n > nums.length) {
            throw new IllegalArgumentException("Number is out of bounds");
        }
        if (n == 0) {
            return true;
        }
        int len = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[len - n + i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        if (nums == null) {
            throw new NullPointerException("Array is null");
        }
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i <= nums.length - 3; i++) {
            boolean allOdd = isOdd(nums[i]) && isOdd(nums[i + 1]) && isOdd(nums[i + 2]);
            boolean allEven = !isOdd(nums[i]) && !isOdd(nums[i + 1]) && !isOdd(nums[i + 2]);
            if (allOdd || allEven) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        if (start >= end) {
            return new int[0];
        }
        int length = end - start;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = start + i;
        }
        return array;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start number can't be bigger than end number");
        }
        int length = end - start;
        if (length <= 0) {
            return new String[0];
        }
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            int val = start + i;
            if (val % 3 == 0 && val % 5 == 0) {
                array[i] = "FizzBuzz";
            } else if (val % 3 == 0) {
                array[i] = "Fizz";
            } else if (val % 5 == 0) {
                array[i] = "Buzz";
            } else {
                array[i] = Integer.toString(val);
            }
        }
        return array;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        if (nums == null) {
            throw new NullPointerException("Array is null");
        }
        if (nums.length == 0) {
            return new int[0];
        }
        int countEven = 0;
        for (int v : nums) {
            if (v % 2 == 0) {
                countEven++;
            }

        }
        int[] result = new int[nums.length];
        int evenPos = 0;
        int oddPos = countEven;
        for (int v : nums) {
            if (v % 2 == 0) {
                result[evenPos++] = v;
            } else {
                result[oddPos++] = v;
            }
        }
        return result;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }
        for (Integer n : nums) {
            if (n != null && n >= 0) {
                result.add(n);
            }
        }
        return result;

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }
        for (Integer i : nums) {
            if (i < 13 || i > 19) {
                result.add(i);
            }
        }
        return result;
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        ArrayList<String> result = new ArrayList<>();
        if (strs == null) {
            return result;
        }
        for (String s : strs) {
            if (s == null) {
                continue;
            }
            if (s.endsWith("y")) {
                continue;
            }

            result.add(s + "y");
        }
        return result;
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }
        for (Integer n : nums) {
            if (n == null) {
                continue;
            }
            int val = n * n + 10;
            int lastDigit = Math.abs(val) % 10;
            if (lastDigit == 5 || lastDigit == 6) {
                continue;
            }
            result.add(val);
        }
        return result;
    }

}
