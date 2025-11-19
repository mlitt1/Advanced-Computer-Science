public class Unit2Exercises {
    
    public static String alarmClock(int day, boolean vacation) {
        // day: 0=Sun, 1=Mon, ... 6=Sat
        if (vacation) {
            // On vacation: weekdays -> 10:00, weekends -> "off"
            if (day >= 1 && day <= 5) {
                return "10:00";
            } else {
                return "off";
            }
        } else {
            // Not on vacation: weekdays -> 7:00, weekends -> 10:00
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
        String word = str.substring(0,1);
        char character = word.charAt(0);
        String word2 = str.substring(3,4);
        char character2 = word2.charAt(0);
        if (character == 'f') {
            return "Fizz";
        } else if (character2 == 'b') {
            return "Buzz";
        } else if (character == 'f' && character2 == 'b') {
            return "FizzBuzz";
        }
        return str;

    }

    public static String doubleChar(String str) {
        for (int i = 0; i == str.length();) {
            String digit = str.substring(i, i + 1);
            String part1 = str.substring(0, i + 1);
            String part2 = str.substring(i, str.length() + 1);
            return part1 + digit + digit + part2;
        }
        return "";

    }

    public static int countHi(String str) {
        String subString = "hi";
        int count = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = str.indexOf(subString, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += subString.length(); // Move past the found substring
            }
        }
        return count;

    }

    public static boolean catDog(String str) {
        
        return false;
    }

    public static String mixString(String a, String b) {
        // to-do: implement this method
        return "";

    }

    public static String repeatEnd(String str, int n) {
        // to-do: implement this method
        return "";
    }

    public static boolean endOther(String a, String b) {
        // to-do: implement this method
        return false;
    }

    public static int countCode(String str) {
        // to-do: implement this method
        return 0;
    }

    public static int countEvens(int[] nums) {
        // to-do: implement this method
        return 0;
    }

    public static int bigDiff(int[] nums) {
        // to-do: implement this method
        return 0;
    }

    public static int sum13(int[] nums) {
        // to-do: implement this method
        return 0;
    }

    public static int[] fizzArray(int n) {
        // to-do: implement this method
        return new int[0];
    }

    public static boolean haveThree(int[] nums) {
        // to-do: implement this method
        return false;

    }

    public static String[] fizzArray2(int n) {
        // to-do: implement this method
        return new String[0];
    }

    public static int[] zeroFront(int[] nums) {
        // to-do: implement this method
        return new int[0];
    }

    public static String[] wordsWithout(String[] words, String target) {
        // to-do: implement this method
        return new String[0];
    }

    public static int scoresAverage(int[] scores) {
        // to-do: implement this method
        return 0;
    }

    public static boolean scoresIncreasing(int[] scores) {
        // to-do: implement this method
        return false;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        // to-do: implement this method
        return 0;
    }

    public static String firstTwo(String str) {
        // to-do: implement this method
        return "";
    }

    public static double divide(int a, int b) {
        // to-do: implement this method
        return 0.0;
    }
}
