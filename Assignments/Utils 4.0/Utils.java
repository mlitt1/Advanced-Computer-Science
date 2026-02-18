import java.util.ArrayList;

public class Utils {

    // ArrayList Methods

    // Get the sum of a list of integers
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int n : list) {
            sum += n;
        }
        return sum;
    }

    // Get the max value in an ArrayList of integers
    public static int max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("List can't be empty");
        }
        int max = list.get(0);
        for (int n : list) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    // Get the min value in an ArrayList of integers
    public static int min(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("List can't be empty");
        }
        int min = list.get(0);
        for (int n : list) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    // Find the index of a value in an ArrayList
    public static int indexOf(ArrayList<?> list, Object value) {
        return list.indexOf(value); // returns -1 if not found
    }

    // Reverse an ArrayList
    public static <Integer> ArrayList<Integer> reverse(ArrayList<Integer> list) {
        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    // 2D Array Methods

    // Get the sum of all elements in a 2D array
    public static double sum(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    // Get the max value in a 2D array
    public static double max(double[][] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array can't be empty");
        double max = arr[0][0];
        for (double[] row : arr) {
            for (double val : row) {
                if (val > max) max = val;
            }
        }
        return max;
    }

    // Get the min value in a 2D array
    public static double min(double[][] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array can't be empty");
        double min = arr[0][0];
        for (double[] row : arr) {
            for (double val : row) {
                if (val < min) min = val;
            }
        }
        return min;
    }

    // Get the average of a submatrix (like your SkyView method)
    public static double submatrixAverage(double[][] arr, int startRow, int endRow, int startCol, int endCol) {
        double sum = 0;
        int count = 0;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                sum += arr[i][j];
                count++;
            }
        }
        return sum / count;
    }

    // Compare two 2D arrays for equality
    public static boolean equals(double[][] arr1, double[][] arr2) {
        if (arr1 == null || arr2 == null) return false;
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != arr2[i].length) return false;
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) return false;
            }
        }
        return true;
    }

    // Flatten a 2D array into a 1D ArrayList
    public static ArrayList<Double> flatten(double[][] arr) {
        ArrayList<Double> flat = new ArrayList<>();
        for (double[] row : arr) {
            for (double val : row) {
                flat.add(val);
            }
        }
        return flat;
    }
    
    // Set every element in a 2D array to null
    public static <T> void setAllToNull(int[][] arr) {
        if (arr == null) return;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = null;
            }
        }
    }
}