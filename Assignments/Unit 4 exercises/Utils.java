public class Utils {
    
    public static String printIntArray(int[] array) {
        String toprint = "{";
        for (int i = 0; i < array.length; i++) {
            if(i != array.length - 1) {
                toprint += array[i] + ", ";
            } else {
                toprint += array[i] + "}";
            }
        }
        return toprint;
    }
    
}
