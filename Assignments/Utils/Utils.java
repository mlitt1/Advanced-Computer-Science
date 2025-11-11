public class Utils {

    // do Utils.variable.nameOfStaticMethod to implement

    // detect if a string is empty
    public static boolean isEmpty(String text) {
        return text == null || text.trim().isEmpty();
    }

    // captializes first letter
    public static String capitalize(String word) {
        if (isEmpty(word)) {
            return "";
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    // compares to see if string is equal
    public static boolean equalsIgnoreCase(String a, String b) {
        if (a == null || b == null) {
            return false;
        }
        return a.equalsIgnoreCase(b);
    }

    // Counts the amoutn of times test is used with "count"
    public static String repeat(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += text;
        }
        return result;
    }

    // generates a random int between two numbers
    public static int randomInRange(int low, int high) {
        if (low > high) {
            int temp = low;
            low = high;
            high = temp;
        }
        return (int)(Math.random() * (high - low)) + low;
    }

    //if a varibalbe is inrange of low/high return true else false
    public static boolean inRange(int value, int low, int high) {
        return value >= low && value <= high;
    }

    // keeps a number between a minimum and maximum
    public static int constraint(int value, int min, int max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

    // converts a string number into an int
    public static int stringToInt(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // converts a double into an int
    public static double parseDoubleSafe(String num) {
        try {
            return Double.parseDouble(num);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    // converts a string into a boolean
    public static boolean parseBooleanSafe(String value) {
        return Boolean.parseBoolean(value);
    }

    // if is even return true
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // if is odd return true
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    // counts num of vowels in a word
    public static int countVowels(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        int count = 0;
        String s = input.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    // counts amount of times code is in a word
    public static int countCode(String str) {
        if (str.isEmpty() || str.length() < 4) {
            return 0;
        }
        int count = 0;
        String s = str.toLowerCase();
        for (int i = 0; i <= s.length() - 4; i++) {
            if (s.charAt(i) == 'c' && s.charAt(i + 1) == 'o' && s.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    // sum of digits of a word
    public static int calculateSumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }

    //makes a string and adds up the length
    public static String generateCatChar(String catId) {
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            char ch = catId.charAt(i);
            if (Character.isDigit(ch)) {
                sum += ch - '0';
            }
        }
        int num = sum % 26;
        char c = (char) ('A' + num);
        return String.valueOf(c);
    }

    //validate id if else return rnadom number (converted from int to string)
    public static String validateCatId(String catId) {
        if (generateCatId().length() >= 1000 && generateCatId().length() <= 9999) {
            return catId;
        } else {
            return String.valueOf(generateRandomNumber(1000, 10000));
        }
    }
    
    // public static String pickup(Dog dog, String personName) {
    //     if (dog.getOwnerName().equals(personName)) {
    //         dog.setStillInFacility(false);
    //         return dog.getName() + " has been picked up by their owner " + dog.getOwnerName() + ".";
    //     }
    //     return dog.getName() + " cannot leave yet, safety first!";
    // }

    // public static void checkIn(Dog dog, String personName) {
    //     if (dog.getOwnerName().equals(personName)) {
    //         dog.setStillInFacility(true);
    //         System.out.println("This dog is valid!!!");
    //     } else {
    //         System.out.println("This dog is invalid, it is a counterfeit dog");
    //     }
    // }

    // public static int validateDogId(int dogId) {
    //     String numDogId = String.valueOf(dogId);
    //     if (numDogId.length() == 3) {
    //         return dogId;
    //     } else {
    //         return (int) (Math.random() * 900 + 100); // random 3-digit
    //     }
    // }

    // public static boolean validateDogTag(Dog dog) {
    //     String dogTag = dog.getDogTag();
    //     return dogTag.length() == 4;
    // }

    // public static char generateDogChar(Dog dog) {
    //     int dogId = dog.getDogId();
    //     int dig1 = dogId / 100 % 10;
    //     int dig2 = dogId / 10 % 10;
    //     int dig3 = dogId % 10;
    //     return (char) ('F' + (dig1 + dig2 + dig3) % 10);
    // }

    // public static int convertToHumanAge(Dog dog) {
    //     int age = dog.getAge();
    //     if (age == 1) {
    //         return 15;
    //     } else if (age == 2) {
    //         return 24;
    //     } else {
    //         return 24 + (age - 2) * 4; // simplified typical formula
    //     }
    // }

    // public static int convertToDogYears(int humanYears) {
    //     if (humanYears <= 15) {
    //         return 1;
    //     } else if (humanYears <= 24) {
    //         return 2;
    //     } else {
    //         return (humanYears - 24) / 4 + 2;
    //     }
    // }

}
