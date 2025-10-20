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
        if (name.indexOf(" ") < 1 ) {
            return name;
        } else {
            return name.substring(0, indexOfFirstSpace(name));
        }
    }

    public static String findLastName(String name) {
        int last = name.lastIndexOf(" ");
        if (last == -1) {
            return name;
        } else {
            return name.substring(last + 1);
        }
    }

    public static String findMiddleName(String name) {
        
    }
}
