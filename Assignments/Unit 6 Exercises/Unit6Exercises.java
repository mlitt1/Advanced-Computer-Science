public class Unit6Exercises {
    
    public static int factorial(int n) {
        int result = 1;
        if (n < 0) {
            return 0;
        }

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static int factorialRecursive(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

    /**
     * Problem 2 - Fibonacci Sequence: Write a recursive and non-recursive method that returns the
     * nth number in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        double sqrt5 = Math.sqrt(5);
        double goldenRatio = (1 + sqrt5) / 2;
        double result = (int) Math.pow(goldenRatio, n) / sqrt5;

        return (int) Math.round(result);
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        if (n < 0) {
            return 0;
        }

        int first = fibonacciRecursive(n - 1);
        int second = fibonacciRecursive(n - 2);

        return first + second;
    }

    /**
     * Problem 3 - Sum of Digits: Write a recursive and non-recursive method that returns the sum of
     * the digits of a given integer.
     */
    public static int sumDigits(int n) {
        if (n < 0) {
            return 0;
        }
        int result = 0;
        int numDigs = String.valueOf(n).length();
        String newNum = "" + n;
        for (int i = 0; i < numDigs; i++) {
            Integer num = Integer.valueOf(newNum.substring(i, i + 1));
            result += num;
        }
        return result;
    }

    public static int sumDigitsRecursive(int n) {
        if (n <= 0) {
            return 0;
        }

        return (n % 10) + sumDigitsRecursive(n / 10);
    }

    /**
     * Problem 4 - Count X: Write a recursive and non-recursive method that returns the count of
     * occurrences of 'x' in a given string.
     */
    public static int countX(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));

            if (c == 'x') {
                count++;
            }
        }
        return count;
    }

    public static int countXRecursive(String str) {
        int count = 0;
        if (str.isEmpty()) {
            return 0;
        }

        if (Character.toLowerCase(str.charAt(0)) == 'x') {
            count = 1;
        }
        return count + countXRecursive(str.substring(1));
    }

    /**
     * Problem 5 - Reverse String: Write a recursive and non-recursive method that returns the
     * reverse of a given string.
     */
    public static String reverseString(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString += (str.substring(str.length() - 1 - i, str.length() - i));
        }
        return newString;
    }

    public static String reverseStringRecursive(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseStringRecursive(str.substring(1)) + str.charAt(0);
    }

    /**
     * Problem 6 - Power of a Number: Write a recursive and non-recursive method that calculates and
     * returns the value of base raised to the power of exponent.
     */
    public static int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public static int powerRecursive(int base, int exponent) {
        if (base == 0) {
            return 0;
        } else if (exponent == 0) {
            return 1;
        }
        return powerRecursive(base, exponent - 1) * base;
    }

    /**
     * Problem 7 - Palindrome Checker: Write a recursive and non-recursive method that checks
     * whether a given string is a palindrome.
     */
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        return reverseString(str).equals(str);
    }

    public static boolean isPalindromeRecursive(String str) {
        str = str.toLowerCase();

        if (str.length() <= 1) {
            return true;
        } else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        return isPalindromeRecursive(str.substring(1, str.length() - 1));
    }

    /**
     * Problem 8 - Greatest Common Divisor (GCD): Write a recursive and non-recursive method that
     * finds and returns the greatest common divisor of two numbers.
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcdRecursive(b, a % b);
        } 
    }

    /**
     * Problem 9 - Bunny Ears 2: We have bunnies standing in a line, numbered 1, 2, ... The odd
     * bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears,
     * because they each have a raised foot. Recursively return the number of "ears" in the bunny
     * line 1, 2, ... n (without loops or multiplication).
     */

    public static int bunnyEars(int bunnies) {
        int ears = 0;
        
        for (int i = 1; i <= bunnies; i++) {
            if (i % 2 == 0) {
                ears += 3;
            } else {
                ears += 2;
            }
        }

        return ears;
    }

    public static int bunnyEarsRecursive(int bunnies) {
        if (bunnies <= 0) {
            return 0;
        }

        if (bunnies % 2 == 1) {
            return 2 + bunnyEarsRecursive(bunnies - 1);
        } else {
            return 3 + bunnyEarsRecursive(bunnies - 1);
        }
    }

    /**
     * Problem 10 - Binary Search: Write a recursive and non-recursive method that implements the
     * binary search algorithm to find and return the index of a given element in a sorted array.
     */
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static int binarySearchRecursiveHelper(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;

        if (arr[mid] == key) {
            return mid;
        } else if (key < arr[mid]) {
            return binarySearchRecursiveHelper(arr, key, low, mid - 1);
        } else {
            return binarySearchRecursiveHelper(arr, key, mid + 1, high);
        }
        
    }

    public static int binarySearchRecursive(int[] arr, int key) {
        return binarySearchRecursiveHelper(arr, key, 0, arr.length - 1);
    }

}