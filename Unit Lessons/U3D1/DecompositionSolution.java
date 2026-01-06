public class DecompositionSolution {
    
    public static void run(){
        int[] hours = hoursArray();
        int[] steps = stepsArray();
        int[] activeMinutes = activeMinutesArray();

        if (lengthValidator(hours, steps, activeMinutes)) {
            System.out.println("Invalid input: arrays must be teh same length.");
            return;
        }
    }

    public static int[] hoursArray() {
        return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    public static int[] activeMinutesArray() {
        return new int[] { 120, 90, 60, 50, 80, 300, 1200, 2200, 2800, 2500, 1800, 900 };
    }

    public static int[] stepsArray() {
        return new int[] { 2, 1, 0, 0, 1, 10, 35, 50, 55, 48, 32, 15 };
    }

    public static boolean lengthValidator(int[] array1, int[] array2, int[] array3) {
        return array1.length == array2.length && array2.length == array3.length;
    }

    public static int sum(int[] array) {
        int sumTotal = 0;
        for (int i = 0; i < array.length; i++) {
            sumTotal += array[i];
        }

        return sumTotal;
    }

    public static int average(int[] array) {
        int total = sum(array);
        return total / array.length;
    }

    public static int countHalfHours(int[] minutes) {
        return thresholdCounter(minutes, 30);
    }

    public static int countMidDay(int[] hours) {
        return thresholdCounter(hours, 12);
    }
 
    public static int thresholdCounter(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= value) {
                count++;
            }
        }
        return count;
    }

    public static int[] subArray(int[] array, int start, int end) {
        int[] resultArray = new int[end - start];

        int resultArrayIndex = 0;
        for (int i = start; i < end; i++) {
            resultArray[resultArrayIndex] = array[i];
            resultArrayIndex++;
        }
        return resultArray;
    }

    public static double[] averageDailyReport(int[] hours, int[] steps) {
        double avgMorning = average(subArray(steps, 0, 3));
        double avgMidday = average(subArray(steps, 4, 7));
        double avgAfternoon = average(subArray(steps, 8, 12));

        String moString = "This is the average morning" + avgMorning;
        String midString = "This is the average mid day " + avgMidday;
        String nString = "This is the average afternoon" + avgAfternoon;
        return null;
    }
}