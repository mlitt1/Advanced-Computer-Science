public class ArraryDemo {
    
    public static void main(String[] args) {

        // Pokemon
        // you can have a team of 6.

        int[] myFavoriteNumbers = new int[4];

        myFavoriteNumbers[0] = 7;
        myFavoriteNumbers[1] = 8;
        myFavoriteNumbers[2] = 13;
        myFavoriteNumbers[3] = 5;
        myFavoriteNumbers[0] = 6;

        System.out.println(myFavoriteNumbers[3]);
        System.out.println(myFavoriteNumbers);
        
        for (int i = 0; i < myFavoriteNumbers.length; i++) {
            System.out.println(myFavoriteNumbers[i]);
        }

        System.out.println(myFavoriteNumbers.length);

        String[] beatles = new String[4];
        beatles[0] = "John Lennon";
        beatles[1] = "Paul McCartney";
        beatles[2] = "Ringo Star";
        beatles[3] = "George Harrison";

        for (int i = 0; i < beatles.length; i++) {
            if (beatles[i] != null) {
                System.out.println(beatles[i].length());
            } else {
                System.out.println("This element is null");
            }
        }

    }
}