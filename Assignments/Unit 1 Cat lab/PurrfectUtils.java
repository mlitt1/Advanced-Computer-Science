public class PurrfectUtils {

    public static String determineCatMood(Cat cat) {
        int level = cat.getMoodLevel();
        if (level > 7 && level <= 10) {
            return "Currently, Cookie is in a great mood. Petting is appreciated.";
        } else if (level > 3 && level <= 7) {
            return "Currently, Cookie is reminiscing of a past life. Petting is acceptable.";
        } else {
            return "Currently, Cookie is plotting revengeance. Petting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            char c = catId.charAt(i);
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        int num = sum % 26;
        return (char) ('A' + num);
    }

    public static String generateCatId() {
        int num = generateRandomNumber(1000, 9999);
        return String.valueOf(num);
    }

    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            int temp = low;
            low = high;
            high = temp;
        }
        return (int) (Math.random() * (high - low + 1)) + low;
    }

    public static String validateCatId(String catId) {
        if (catId.length() == 4 && catId.matches("\\d+")) {
            return catId;
        } else {
            return generateCatId();
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            return 0;
        } else if (moodLevel > 10) {
            return 10;
        } else {
            return moodLevel;
        }
    }

    public static String bootUp(Cat cat) {
        return cat.toString();
    }

    public static String pet(Cat cat) {
        int mood = cat.getMoodLevel();
        if (mood >= 2) {
            cat.setMoodLevel(mood + 1);
            return "Petting successful!";
        } else if (cat.isHungry()) {
            cat.setMoodLevel(mood - 1);
            return "Petting failed...";
        } else {
            cat.setMoodLevel(mood + 1);
            return "Petting successful!";
        }
    }

    public static String trimClaws(Cat cat) {
        int random = generateRandomNumber(1, 2);
        if (random == 1) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            return "Attempting to trim claws... Cookie did not like that...";
        } else {
            cat.setMoodLevel(cat.getMoodLevel() - 2);
            return "Attempting to trim claws... Cookie really hated that!";
        }
    }

    public static String cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(false);
        return "Cleaning the litter box...\nDone!\nCookie appreciated that.";
    }

    public static String feed(Cat cat) {
        int newLevel = cat.getMoodLevel() + 2;
        cat.setMoodLevel(newLevel);
        cat.setHungry(false);
        return "Filling up Cookie's bowl...\nDone!\nCookie is eating...\nCookie is full!";
    }
}
