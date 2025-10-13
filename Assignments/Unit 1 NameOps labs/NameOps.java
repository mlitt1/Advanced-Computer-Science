public class NameOps {
    
    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\")";
    }

    public static String whoIsAwesome(String name) {
        return name + "is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        if (name.indexOf(" ") >= 1){
            return name.indexOf(" ");
        } else {
            return -1;
        }
            
    }

    public static int indexOfSecondSpace(String name) {
        String shortenedName = name.substring(indexOfFirstSpace(" ") + 1);
        if (shortenedName.indexOf(" ") == -1) {
            return -1;
        } else {
            return shortenedName.indexOf(" ") + indexOfFirstSpace(name) + 1;
        }
    }

    public static String findFirstName(String name) {
        return name.substring(indexOfFirstSpace(" "));
    }
}
