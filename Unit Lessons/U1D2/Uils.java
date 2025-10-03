public class Uils {
    public static int generateRandomNumberBetween(int low, int high) {
        return (int) (Math.random() * (high - low)) + low;
    }
}
