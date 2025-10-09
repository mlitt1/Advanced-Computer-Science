public class PawesomeUtils {

    public static String generateDogTag(int dogId, char dogChar) {
        return generateDogTag(dogId + dogChar, dogChar);
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            return dog.getName() + "has been picked up by their owner" + dog.getOwnerName() + ".";
        }
        return dog.getName() + "They can't leave yet, safety first!";
    }

    public static void checkIn(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(true);
        }
    }

    public static int validateDogId(int dogId) {
        String numDogId = String.valueOf(dogId);
        if (numDogId.length() == 3) {
            return dogId;
        } else {
            return (int) (Math.random() * 900 + 100);
        }
    }


    public static boolean validateDogTag(Dog dog) {
        String newDogTag2 = dog.getDogTag();
        String numDogTag2 = String.valueOf(newDogTag2);
        if (numDogTag2.length() == 4) {
            return true;
        } else {
            return false;
        }
    }

    public static char generateDogChar() {
        int dig3 = dogId % 10;
        int dig2 = dogId / 10 % 10;
        int dig1 = dogId / 100 % 10;
        return dogChar = (char) ('F' + (dig1 + dig2 + dig3) % 10);
    }

}
