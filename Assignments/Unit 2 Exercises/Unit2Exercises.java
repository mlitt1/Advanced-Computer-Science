public class Unit2Exercises {

    public static String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day >= 1 && day <= 5) {
                return "10:00";
            } else {
                return "off";
            }
        } else {
            if (day >= 1 && day <= 5) {
                return "7:00";
            } else {
                return "10:00";
            }
        }
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else if (a - b == 6 || b - a == 6) {
            return true;
        } else if (a + b == 6) {
            return true;
        } else {
            return false;
        }
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        boolean f = str.startsWith("f");
        boolean b = str.endsWith("b");
        if (f && b) {
            return "FizzBuzz";
        }
        if (f) {
            return "Fizz";
        }
        if (b) {
            return "Buzz";
        }
        return str;
    }

    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result += c;
            result += c;
        }
        return result;
    }

    public static int countHi(String str) {
        String subString = "hi";
        int count = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = str.indexOf(subString, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += subString.length();
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        if (str == null) {
            return true;
        }
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.equals("cat")) {
                countCat++;
            }
            if (sub.equals("dog")) {
                countDog++;
            }
        }
        return countCat == countDog;
    }

    public static String mixString(String a, String b) {
        String result = "";
        int max = Math.max(a.length(), b.length());
        for (int i = 0; i < max; i++) {
            if (i < a.length()) {
                result += a.substring(i, i + 1);
            }
            if (i < b.length()) {
                result += b.substring(i, i + 1);
            }
        }
        return result;
    }

    public static String repeatEnd(String str, int n) {
        String newString = str.substring(str.length() - n, str.length());
        String result = "";
        for (int i = 0; i < n; i++) {
            result += newString;
        }
        return result;
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() >= b.length()) {
            String endA = a.substring(a.length() - b.length());
            if (endA.equals(b)) {
                return true;
            }
        }
        if (b.length() >= a.length()) {
            String endB = b.substring(b.length() - a.length());
            if (endB.equals(a)) {
                return true;
            }
        }
        return false;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 4; i++) {
            if (str.substring(i, i + 2).equals("co")) {
                if (str.substring(i + 3, i + 4).equals("e")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max - min;
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i > 0 && nums[i - 1] == 3) {
                    return false;
                }
            }
        }
        return count == 3;
    }

    public static String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = "" + i;
        }
        return arr;
    }

    public static int[] zeroFront(int[] nums) {
        int[] arr = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                arr[index] = 0;
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[index] = nums[i];
                index++;
            }
        }
        return arr;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                count++;
            }
        }
        String[] arr = new String[count];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                arr[index] = words[i];
                index++;
            }
        }
        return arr;
    }

    public static int scoresAverage(int[] scores) {
        int mid = scores.length / 2;
        int sum1 = 0;
        for (int i = 0; i < mid; i++) {
            sum1 += scores[i];
        }
        int avg1 = sum1 / mid;

        int sum2 = 0;
        for (int i = mid; i < scores.length; i++) {
            sum2 += scores[i];
        }
        int avg2 = sum2 / (scores.length - mid);

        if (avg1 > avg2) {
            return avg1;
        } else {
            return avg2;
        }
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int maxA = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0 && a[i] > maxA) {
                maxA = a[i];
            }
        }
        int maxB = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 10 == 0 && b[i] > maxB) {
                maxB = b[i];
            }
        }
        return maxA + maxB;
    }

    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str + "*";
        }
        return str.substring(0, 2);
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            return 0.0;
        }
        if (a > b) {
            int biggerNumber = a;
            int smallerNumber = b;
            return (double) biggerNumber / smallerNumber;
        } else if (b > a){
            int biggerNumber = b;
            int smallerNumber = a;
            return (double) biggerNumber / smallerNumber;
        } else {
            return 0;
        }
    }
}
