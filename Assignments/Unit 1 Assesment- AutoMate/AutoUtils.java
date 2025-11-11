public class AutoUtils {
    
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            return 0;
        } else if (cleanlinessLevel > 10) {
            return 10;
        } else {
            return cleanlinessLevel;
        }
    }

    public static int cleanCar(Car car) {
        int clean = car.getCleanlinessLevel() + 2;
        return clean;
    }

    public static String fixName(String name) {
        String text = "    Hello,    World!    ";
        String trimmedText = text.trim();
        return trimmedText;
    }

    public static String generateUsername(String name) {
        int randnum = (int) ((Math.random() * 100) + 1950);
        return "@" + fixName(name) + "_" + randnum;
    }

    
}
