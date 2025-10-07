public class StringDemo {
    // IN the AP only use these methdos from this class


    public static void main(String[] args) {
        // Strings are objects
        String fullName = "Morgan Litt";
        String fullName2 = "Morgan Litt";
        fullName2 = "Morgan Reid Litt";

        System.out.println(fullName == fullName2);

        String abc = "abc";
        String def = "def";
        String abd = "abd";

        System.out.println(abc.compareTo(abd));
        // returns negative if abc is before abd
        // returns positive if abc is after
        // returns 0 if strings are equal

    }
}