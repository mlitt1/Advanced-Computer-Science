public class Unit3Practice {
    
    public static int parsePositiveInteger(String str) {
        int number = Integer.parseInt(str);
        if (number <= 0) {
            throw new NumberFormatException("Number has to be a whole number");
        }
        return number;
    }

    public static String getArrayElement(String[] arr, int index) {
        return arr[index];
    }

    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number");
        }
        return Math.sqrt(number);
    }

    public static int sumArrayElements(int[] array) {
        if (array == null) {
            throw new NullPointerException("Array can't be null");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double calculatePower(double base, int exponent) {
        if (base < 0) {
            throw new IllegalArgumentException("Base number must be positive");
        }
        return Math.pow(base, exponent);
    }

}
