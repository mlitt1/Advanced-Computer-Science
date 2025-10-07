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
}
