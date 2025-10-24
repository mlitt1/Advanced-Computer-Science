public class NameOps {

    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        int first = name.indexOf(" ");
        return first >= 0 ? first : -1;
    }

    public static int indexOfSecondSpace(String name) {
        int firstSpace = indexOfFirstSpace(name);
        if (firstSpace == -1) {
            return -1;
        }

        int secondSpace = name.indexOf(" ", firstSpace + 1);
        return secondSpace >= 0 ? secondSpace : -1;
    }

    public static String findFirstName(String name) {
        int firstSpace = indexOfFirstSpace(name);
        if (firstSpace == -1) {
            return name;
        }
        return name.substring(0, firstSpace);
    }

    public static String findLastName(String name) {
        int last = name.lastIndexOf(" ");
        if (last == -1) {
            return "";
        }
        return name.substring(last + 1);
    }

    public static String findMiddleName(String name) {
        int firstSpace = indexOfFirstSpace(name);
        int secondSpace = indexOfSecondSpace(name);

        if (firstSpace == -1 || secondSpace == -1) {
            return "";
        }

        return name.substring(firstSpace + 1, secondSpace);
    }

    public static String generateLastFirstMidInitial(String name) {
        String first = findFirstName(name);
        String middle = findMiddleName(name);
        String last = findLastName(name);

        if (last.isEmpty()) {
            return first;
        }

        if (middle.isEmpty()) {
            return last + ", " + first;
        }

        return last + ", " + first + " " + middle.charAt(0);
    }
}
