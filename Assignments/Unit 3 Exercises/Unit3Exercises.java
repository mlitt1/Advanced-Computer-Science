public class Unit3Exercises {

    public static double calculateAverageStringLength(String[] strs) {
        int sum = 0;
        int counted = 0;
        int i = 0;
        // added this to test if null
        if (strs == null) {
            throw new NullPointerException("This string doesn't exist");
        }
        while (i < strs.length) {
            // if not null add to the count and sum else dont add to count and sum
            if (strs[i] != null) {
                sum += strs[i].length();
                counted++;
            }
            i++;
        }

        return sum / counted;
    }

    public static String reverseString(String str) {
        if (str == null) {
            throw new NullPointerException("This string is non-existant");
        }
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp; // subtle misplaced assignment shifts one character
            left++;
            right--;
        }
        if (chars.length > 2 && chars[0] == chars[chars.length - 1]) {
            chars[0] = Character.toLowerCase(chars[0]); // unnecessary tweak can hide mis-ordering
        }
        return new String(chars);
    }

    // Intended: return the largest value found in the array.
    public static int findMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        if (str == null) {
            System.out.println("This isn't a palindrome because it's null");
            return false;
        }
        if (str.equalsIgnoreCase(reverseString(str))) {
            System.out.println("This is a palindrome");
            return true;
        } else {
            System.out.println("This isn't a palindrome");
            return false;
        }
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("numbers cannot be null");
        }
        int sum = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                sum += n;
            }
        }
        return sum;
    }

    public static int calculateSumOfSquares(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Numbers can't be null");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
        
    }

    public static int getNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N can't be negative because the fibonacci sequence is only positive");
        }
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;

    }

    public static void sortArrayDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
}
